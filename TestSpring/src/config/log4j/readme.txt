【未完成部分：
1.ConversionPattern的格式；
2.使用MDC操作自定义字段的方法http://www.cnblogs.com/shenliang123/archive/2012/05/02/2479286.html
3.发送至邮件
】

环境：首先我们要使用log4j日志文件时，我们需将两个必须的包放入lib目录下：log4j.XX.jar和commons-logging.XX.jar;

不在web项目下使用log4j时，将log4j.properties放在src下即可
基本书写方法为:log4j.rootLogger = [ level ] , appenderName1, appenderName2, …
rootLogger代表最基本的Logger

由于我们进行了日志优先级的配置：log4j.rootLogger=INFO,db，只有debug级别就不能进行打印了

# 日志级别
OFF：关闭了日志信息  
FATAL：可能导致应用中止的严重事件错误  
!!!ERROR：严重错误 主要是程序的错误(推荐使用的四个级别)  
!!!WARN：一般警告，比如session丢失  
!!!INFO：一般要显示的信息，比如登录登出  
!!!DEBUG：程序的调试信息  
TRACE：比DEBUG更细粒度的事件信息  
ALL：打开所有级别的日志

log4j提供了一系列的Appender，允许将日志输送到不同的地方，如控制台、文件、数据库等：

!!!org.apache.log4j.ConsoleAppender（控制台）
org.apache.log4j.FileAppender（文件）
!!!org.apache.log4j.jdbc.JDBCAppender（数据库）
org.apache.log4j.net.SMTPAppender（邮件）
org.apache.log4j.DailyRollingFileAppender（每天产生一个日志文件）
!!!org.apache.log4j.RollingFileAppender（文件大小到达指定尺寸的时候产生一个新的文件）
org.apache.log4j.WriterAppender（将日志信息以流格式发送到任意指定的地方）

如下配置：
log4j.logger.com.huawei=INFO,db  
log4j.logger.org=WARN, A1log
log4j.logger.com =WARN, A2log
这个配置就是将不同的包下的信息输出到不同的文件中，根据下面的配置可知以xidian开头的包下的java文件的日志信息时进行数据库存储的，
而org与com包开头的日志信息是输出到文件中，文件的输出地址是${webapp.root}/WEB-INF/logs/org.log即项目的WEB-INF目录下的logs文件夹中，
为了得到${webapp.root}我们还需要到web.xml文件中进行配置<context-param>和<listener>


log4j各个模式的演示(这里将属性配置与配置拆开，我觉得降低了可读性，项目中不采用)
注意：1.记得把数据库连接的相关包放到lib目录下，2.在写连接数据库的信息时如user等注意后面不要有空格，否则就不能连上数据库
# +======================================================================+#
log4j.rootLogger=${log4j.log.level},${log4j.log.target}
log4j.addivity.org.apache=true
# +======================================================================+#
# | [target] - Console
# +----------------------------------------------------------------------+#
log4j.appender.CONSOLE=org.apache.log4j.ConsoleAppender
log4j.appender.CONSOLE.Threshold=${log4j.log.level}
log4j.appender.CONSOLE.Encoding=${log4j.log.encoding}
log4j.appender.CONSOLE.Target=System.out
log4j.appender.CONSOLE.layout=${log4j.log.layout}
log4j.appender.CONSOLE.layout.ConversionPattern=${log4j.log.layout.pattern}
# +======================================================================+#
# | [target] - FILE
# +----------------------------------------------------------------------+#
log4j.appender.FILE=org.apache.log4j.RollingFileAppender
log4j.appender.FILE.Threshold=${log4j.log.level}
log4j.appender.FILE.Encoding=${log4j.log.encoding}
log4j.appender.FILE.File=${log4j.log.dir}/runtime.log
log4j.appender.FILE.Append=true
log4j.appender.FILE.MaxFileSize=2048KB
log4j.appender.FILE.MaxBackupIndex=10
log4j.appender.FILE.layout=${log4j.log.layout}
log4j.appender.FILE.layout.ConversionPattern=${log4j.log.layout.pattern}
# +======================================================================+#
# | [target] - DATABASE
# +----------------------------------------------------------------------+#
log4j.appender.DATABASE=org.apache.log4j.jdbc.JDBCAppender
log4j.appender.DATABASE.Threshold=ERROR
log4j.appender.DATABASE.URL=jdbc:mysql://127.0.0.1:3306/spring
log4j.appender.DATABASE.driver=com.mysql.jdbc.Driver
log4j.appender.DATABASE.user=root
log4j.appender.DATABASE.password=liuriqi
log4j.appender.DATABASE.layout=${log4j.log.layout}
log4j.appender.DATABASE.sql=INSERT INTO tv_log4j(message)VALUES('${log4j.log.layout.pattern}')
# +======================================================================+#
# | [target] - EMAIL
# +----------------------------------------------------------------------+#
log4j.appender.EMAIL=org.apache.log4j.net.SMTPAppender
log4j.appender.EMAIL.Threshold=FATAL
log4j.appender.EMAIL.BufferSize=10
log4j.appender.EMAIL.From=fromuser@gmail.com
log4j.appender.EMAIL.SMTPHost=localhost
log4j.appender.EMAIL.Subject=Log4J Message
log4j.appender.EMAIL.To=touser@gmail.com
log4j.appender.EMAIL.layout=${log4j.log.layout}
log4j.appender.EMAIL.layout.ConversionPattern=${log4j.log.layout.pattern}
# +======================================================================+#

上面配置相关的变量，我提取出来统一放到变量配置文件里边，如下：
# +======================================================================+#
# | log4j config
# +----------------------------------------------------------------------+#
log4j.log.dir=logs/
#log4j.log.level=ALL,TRACE,DEBUG,INFO,WARN,ERROR,FATAL,OFF
log4j.log.level=DEBUG
#log4j.log.target=CONSOLE,FILE,DATABASE,EMAIL,SOCKET
log4j.log.target=CONSOLE,FILE
log4j.log.encoding=UTF-8
log4j.log.layout=org.apache.log4j.PatternLayout
log4j.log.layout.pattern=[%d %r] [%-5p] [%t] [%l] [%m]%n
# +======================================================================+#