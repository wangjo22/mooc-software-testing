package tudelft.invoicemocked;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class InvoiceFilterTest {
    @Test
    void filterInvoices() {

        Invoice mauricio = new Invoice("Mauricio", 20.0);
        Invoice arie = new Invoice("Arie", 300.0);

        InvoiceDao dao = Mockito.mock(InvoiceDao.class);

        List<Invoice> results = Arrays.asList(mauricio, arie);
        Mockito.when(dao.all()).thenReturn(results);

        InvoiceFilter filter = new InvoiceFilter(dao);
        List<Invoice> result = filter.filter();

        Assertions.assertEquals(mauricio, result.get(0));
        Assertions.assertEquals(1, result.size());
    }

}


/*
The terms controllability and observability are common in the field. In the following, we present Binder's definitions:

Controllability determines the work it takes to set up and run test cases and the extent to
which individual functions and features of the system under test (SUT) can be made to respond to test cases.
Observability determines the work it takes to set up and run test cases and the extent to
which the response of the system under test (SUT) to test cases can be verified.
In other words, controllability is about how easy it is for us to provide inputs and invoke the behaviour
that we want in the system under test.
Observability is about how easy it is for us to observe the system under test in order to verify
whether the system behaved as expected.
 */



/*
First, Dependency inversion. Robert Martin defines the Dependency Inversion Principle as:
    High-level modules should not depend on low-level modules. Both should depend on abstractions.
    Abstractions should not depend upon details. Details should depend upon abstractions.
    So, dependency inversion is about how classes are designed.
    The principle makes us think about what parts of our system are (should be) abstractions and
    what parts contain low level details.

Dependency injection, on the other hand, is about how one object knows the dependencies of other objects,
so that it can inject them, when needed.
    Dependency Injection is about how objects get their dependencies.
    As you see, both are different, but somewhat related.
    A question for you: how do they both help us achieve testability?
 */