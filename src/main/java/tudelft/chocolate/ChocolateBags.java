package tudelft.chocolate;

public class ChocolateBags {

    //-----------------------------------------------------------------------
    // We build chocolate packages!
    // A package should store a different number of kilos.
    // There are small bars (1 kilo each) and big bars (5 kilos each).
    // We should calculate the number of small bars to use,
    // assuming we always use big bars before small bars.
    // Return -1 if it can't be done.
    //-----------------------------------------------------------------------

    public int calculate(int small, int big, int total) {
        int maxBigBoxes = total / 5;
        int bigBoxesWeCanUse = maxBigBoxes < big ? maxBigBoxes : big;
        total -= (bigBoxesWeCanUse * 5);

        if(small < total)
            return -1;
        return total;

    }

}


/*
Thinking about boundaries and corner cases is not an easy task.
However, developers often do common mistakes, which may serve as hints for us when testing any software system.

In this unit, we'll tell you about the CORRECT way.
You can read more about them in the "Pragmatic Unit Testing in Java 8 with JUnit" book, from Jeff Langr,
with Andy Hunt & Dave Thomas, edited by the Pragmatic Programmers, edition of 2015.

The CORRECT way stands for Conformance, Ordering, Range, Reference, Existence, Cardinality, and Time:

Conformance: Many inputs should conform to a specific format. For example, an e-mail address has a name@domain format.
What happens to our system if the e-mail is invalid, e.g, no name, or no domain, or invalid domain?
Ordering: The input and output may depend on some ordering criteria. For example, our system expects the user to input all invoices for reimbursement in the chronological order they happened. What happens if the user makes a mistake and does not send it in the right order? Or, our system may need to return the list of best players, according to the number of points they made in the last game, from the best to the worst. Does the system return in the right order?
Range: The inputs should be within a defined limit. For example, the user needs to input her age. What happens if she passes a negative number? What happens if she passes 200?
Reference: The inputs and behaviour under test may require a previous state.
For example, in a web store, for an order to be placed, the user needs to have an account first.
What happens if the user tried to place an order without an account?
Existence: The inputs "may not exist". What happens if someone passes a null or an empty string?
Cardinality: The famous off-by-one error. It happens when we forget to "iterate the last item" in our algorithm.
For example, if you should return the number of elements between m and n (inclusive),
the intuitive answer would be (n-m), whereas the right answer is (n-m+1).
In practice, this often happens in iterative loops: developers often iterate one time too few.
You can read about the fencepost error in the Wikipedia.
As a tip, what happens to your system when it has zero, one, or many values to iterate?
Time: Your input may be about date/time. What happens to your system if the input was done by a person in a place that does not have Daylight Saving Time? Does the system work for someone in New York (GMT-5) as well as for someone in Amsterdam (GMT+1)?
These are generic tips that may fit in any software system. Take them into consideration when thinking about boundary and corner cases.
 */