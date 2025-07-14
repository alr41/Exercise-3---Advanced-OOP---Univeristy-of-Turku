# Exercise-3---Advanced-OOP---Univeristy-of-Turku

## 1. Student ID
Student ID: 2406530

## 2. Exercise
The Duckburg Bank has commissioned you to specify a program that calculates the monthly installment of the mortgage repayment for customers, when the customer provides the principal amount (i.e., the amount the customer receives as a loan) and the loan term (in months, allowed range 0-300). For simplicity, it is agreed that the monthly installment is calculated using the formula:

monthly_installment = principal / loan_term + principal / 240

Task: Design a well-justified structure for the program using Java routines (methods). The goal is to take advantage of routine abstraction, such as reusability. The program is intended to be a web version later, but the current prototype would ask for information from the user via the command line.

In the specification, describe the routine terms and conditions and their purposes. Also, consider special situations. If you find the task suitable for object-oriented programming, you can also model the task based on classes instead of routines.

You may also implement the program if you wish, but just the specification is sufficient. (If you absolutely want a challenge, you can optionally calculate the monthly installment precisely using the 12-month Euribor rate, applying the annuity principle. The bank's margin would be a reasonable 1.0%. The task ignores other potential bank charges for loan management and other customer-related responsibilities.)

## 3. Specifications
### Purpose
The **MortgageLoan** class models a mortgage payment scenario for Duckburg Bank. It encapsulates the loan data and provides a method to calculate the customer's monthly installment based the given formula. The class is designed with data validation, routine abstraction, and reusability in mind, making it suitable for both command-line use and future web-based implementations.

### Class overview
**Class name**: MortgageLoan.

**Fields**: "double principal" (loan amount received by the customer) and "int loanTerm" (duration of the loan in months).

**Constructor**: "MortgageLoan(double principal, int loanTerm)" initializes the object and enforces validity of inputs.

**Method**: "double monthlyInstallment()" returns the monthly payment using the formula: monthly_installment = principal / loanTerm + principal / 240

**Getters**: "getPrincipal()" and "getLoanTerm()" to access field values.

### Data validation rules
The **principal** must be positive and the **loanTerm** must be an integer between 1 and 300 (inclusive). If these conditions are violated, the IllegalArgumentException is thrown.

### Routine abstraction and reusability
"monthlyInstallment()" encapsulates the logic for calculating the monthly payment, ensuring the formula is defined in a reusable method.

### Main() method
The main() method, in the prototype phase, serves as a serves as a simple command-line interface that allows users to interact with the MortgageLoan class. 

That being said, it prompts the user to enter the loan principal amount and the term in months, then creates a MortgageLoan object using these inputs. With this data, it is possible to calculate and output the monthly installment.
