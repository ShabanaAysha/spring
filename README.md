Examination / Questionarie portal.

Question (id, Question Label, List<String> options, course)
1.Allows to upload questions in excel / via api calls
2.Get all questions from db.
3.Edit single / mutliple Question.
4.Delete all / single question.
5.Create a new course (id, courseName, courseImagePath)
6. Create a new college/institution. (id, institutionName, Address)

Each College can have association with course.
Each Course will have association with question.

User
Create new user (UserName, FirstName, LastName, Password(Encrypted), Address, College/institution,Year of study, Role)
Update user
Delete User
Assign role (Admin, Student)

Add New Address when creating a new user or Creating new college.
Address(id, City, State, Country, AddressLine1, AddressLine2, Pincode)

Answer
--- will update once above done.
