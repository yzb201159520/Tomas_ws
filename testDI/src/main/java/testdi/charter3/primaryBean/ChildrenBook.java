package testdi.charter3.primaryBean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 *
 * Created by thomas on 2017/7/25.
 */
@Primary
@Component
public class ChildrenBook implements Book{
}
