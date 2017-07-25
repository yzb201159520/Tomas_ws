package testdi.charter3.primaryBean;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

/**
 * Created by thomas on 2017/7/25.
 */
@Component
@Conditional(ConditinalClass.class)
public class ProfessionalBook implements Book {
}
