# [Android course](https://teachmeskills.ru/courses/android-razrabotka-online) in [TSM](https://teachmeskills.ru) school.

**who**: Martynov Denis

**group**: AN10-onl

**module**: java

### Lessons

<dl>
    <dt>lesson-1. Intro about java.</dt>
    <dd>No homework</dd>
    <dt>lesson-2. Repositories.</dt>
    <dd>Added HelloWorld class. Change markup in readme file.</dd>
    <dt>lesson-3. Variables, expressions, operators</dt>
    <dd>
        <p>Homework consists of three java classes: <b>ControlFlowConstruction, Loop, AdditionalTasks</b>. 
        Every java class contains public, private static methods and method main.</p>
        <p><b>Public</b> methods are solutions of tasks. They include javadoc with <b>"Task #{number}"</b> title.</p>
        <p><b>Private</b> methods are helpers to solution of task.</p>
        <p>Method <b>main</b> performs all tasks for class.</p>
        <p><b>The topic is learned.</b></p>
    </dd>
    <dt>lesson-4. Arrays.</dt>
    <dd>
        <p>Homework consists of two java classes: <b>PartOne, AdditionalTasks</b>. 
        Every java class contains public, private static methods and method main.</p>
        <p><b>Public</b> methods are solutions of tasks. They include javadoc with <b>"Task #{number}"</b> title.</p>
        <p><b>Private</b> methods are helpers to solution of task.</p>
        <p>Method <b>main</b> performs all tasks for class.</p>
        <p><b>No problem with topic.</b></p>
    </dd>
    <dt>lesson-5. Multidimensional arrays.</dt>
    <dd>
        <p>Homework consists of two java classes: <b>PartOne, AdditionalTasks</b>. 
        Every java class contains public, private static methods and method main.</p>
        <p><b>Public</b> methods are solutions of tasks. They include javadoc with <b>"Task #{number}"</b> title.</p>
        <p><b>Private</b> methods are helpers to solution of task.</p>
        <p>Method <b>main</b> performs all tasks for class.</p>
        <p><b>No problem with topic.</b></p>
    </dd>
    <dt>lesson-6. Classes and Objects.</dt>
    <dd>
        <h6>Part 1.</h6>
<pre>
    CreditCard
        - long accountNumber
        - double amount
        + void charge(double amount) 
        + void withdraw(double amount)
        + void displayInfo()
</pre>
        </dd>
    <dd>
        <h6>Additional part 1.</h6>
<pre>
    Computer
        - float price
        - String model
        - RAM ram
        - HDD hdd
        + RAM ram()
        + HDD hdd()
        + void displayInfo()
    RAM
        - String label
        - int volume
        + String displayInfo()
        + boolean setLabel(String label)
        + boolean setVolume(int volume)
    HDD
        - String label
        - int volume
        - HDDTypeEnum type
        + void displayInfo()
        + boolean setLabel(String label)
        + boolean setVolume(int volume)
        + boolean setType(HDDTypeEnum type)
    HDDTypeEnum
        INTERNAL
        EXTERNAL
</pre>
    </dd>
<dt>lesson-7. Principles of OOP.</dt>
    <dd>
        <h6>Part 1.</h6>
<pre>
Phone
    - int phone
    - int weight
    - String model
    + int getPhone() 
    + int getWeight() 
    + String getModel() 
    + void setPhone() 
    + void setWeight() 
    + void setModel() 
    + void receiveCall(String callerName)
    + void receiveCall(String callerName, int callerPhoneNumber)
    + void sendMessage(int... numbers)
</pre>
        </dd>
<dd>
        <h6>Additional part 1.</h6>
<pre>
Doctor
    - DoctorSpecializationEnum specialization
    + treat()
Surgeon : Doctor
Dentist : Doctor
Therapist : Doctor
Patient
    - TreatmentPlan treatmentPlan
    + TreatmentPlan getTreatmentPlan()
    + void setTreatmentPlan()
TreatmentPlan
    - int code
    + int getCode()
PatientCard
    - Patient patient
    - Doctor doctor
    + Patient getPatient()
    + Doctor getDoctor()
Hospital
    - Doctor[] doctors
    - PatientCard[] patientCards
    + void appointDoctorTo(Patient patient)
    + void startTreatment(Patient patient)
DoctorSpecializationEnum
    SURGEON, THERAPIST, DENTIST

    
</pre>
        </dd>
<dt>lesson-8. Interfaces and abstract classes.</dt>
    <dd>
        <h6>Part 1-1.</h6>
<pre>
abstract Figure
 - String name
 + String getName()
 + abstract double calculatePerimeter()
 + abstract double calculateArea()
Circle : Figure
 + double calculatePerimeter()
 + double calculateArea()
Rectangle : Figure
 + double calculatePerimeter()
 + double calculateArea()
Triangle : Figure
 + double calculatePerimeter()
 + double calculateArea()
</pre>
        </dd>
<dd>
        <h6>Part 1-2.</h6>
<pre>
interface Employee
 + void displayPosition()
 + String getPosition()
Director : Employee
 - String position
 + String getPosition()
 + void displayPosition()
Worker : Employee
 - String position
 + String getPosition()
 + void displayPosition()
Accountant : Employee
 - String position
 + String getPosition()
 + void displayPosition()
</pre>
        </dd>
<dd>
        <h6>Additional.</h6>
<pre>
abstract Document
 - int number
 - Date date
 - SimpleDateFormat dateFormatter
 + int getNumber()
 + void setNumber(int number)
 + Date getDate()
 + void setDate(Date date)
 + String getInfo()
 abstract void displayInfo()
FinancialInvoice : Document
 - double monthTotalAmount
 - int departmentCode
 + double getMonthTotalAmount()
 + void setMonthTotalAmount(double monthTotalAmount)
 + int getDepartmentCode()
 + void setDepartmentCode(int departmentCode)
 + void displayInfo()
EmployeeContract : Document
 - Date contractEndDate
 - String employeeName
 + Date getContractEndDate()
 + void setContractEndDate(Date contractEndDate)
 + String getEmployeeName()
 + void setEmployeeName(String employeeName)
 + void displayInfo()
ProductContract : Document
 - String productType
 - int productsCount
 + String getProductType()
 + void setProductType(String productType)
 + int getProductsCount()
 + void setProductsCount(int productsCount)
 + void displayInfo()
Register
 - Document[] documents
 + boolean saveDocument(Document document)
 + void displayDocumentInfo(Document document)
</pre>
        </dd>
</dl>
