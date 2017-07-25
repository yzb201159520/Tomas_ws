package testdi.charter3.primaryBean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by thomas on 2017/7/25.
 */
@Component
@Qualifier("book")
public class CookBook implements Book {
}
