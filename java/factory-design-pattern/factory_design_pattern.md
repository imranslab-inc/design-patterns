---

<p align="center">
    <img src="DESIGN_PATTERN_IMAGE_URL" alt="Design Pattern Image" width="250"/>
</p>

<h1 align="center">Design Pattern Name</h1>

---

## Definitions:
Book: 
Design Patterns: Elements of reusable Object-Oriented Software by Erich Gamma, Richard Helm, Ralph Johnson, 
and John Vlissides.

Definition: 
Define an interface for creating an object, but let subclasses decide which class to instantiate. The
Factory method lets a class defer instantiation to subclasses.

Book:
Head First Design Patterns by Elisabeth Freeman and Kathy Sierra

Definition:
The Factory Pattern defines an interface for creating an object, but it's the responsibility of the derived class to 
implement the method and decide which class to instantiate.

Book:
Pattern-Oriented Software Architecture Volume 1: A System of Patterns by Frank Buschmann, Regine Meunier, Hans Rohnert, 
Peter Sommerlad, and Michael Stal:

Definition:
Provide an interface for creating families of related or dependent objects without specifying their concrete classes.


---

## Intent

1. Encapsulate Object Creation:
Details: Centralizing the logic of object creation allows for greater flexibility in determining which object to create 
without having to change the client code. This encapsulation helps in evolving the system without much hassle.
2. Provide Abstraction Over Concrete Classes:
The Factory Pattern emphasizes using interfaces or abstract classes, enabling the client code to remain decoupled from 
specific implementations fo concrete classes. This leads to more adaptable and maintainable code
3. Support Policy-driven Design:
The pattern allows object creation to adhere to specific policies or rules, ensuring consistency across the system.
4. Facilitate Lazy Initialization:
Delaying the instantiation of an object until it's genuinely required can save system resources. The Factory Pattern is 
instrumental in implementing such lazy initialization.
5. Provide Hooks for Subclasses:
The Factory Method allows base classes to define a template for object creation but can delegate the final creation to 
subclasses. This offers more extensibility and customization in the system.

---

## When to Use

1. Scenario 1:
The situation: Suppose you are building a cross-platform UI library where components like buttons, windows, and sliders 
might look different depending on the operating system.
Usage: You use a factory to produce UI components appropriate for the current OS. The client code requests a button, 
and the factory ensures the correct OS specific button in instantiated without the client needing to know the specific 
button subclass.
2. Database Connection Factory:
The situation: Imagine a SaaS application that allows customers to connect to their own databases. Some customers use
OracleDB, some MySQL, while others use PostgresSQL. Every time a user logs in, the system should establish a connection
without tangling the code with multiple conditionals.
3. UI Component Generation:
The Situation: You are building Google's next flagship dashboard tool. The tool should seamlessly run on desktop browsers,
tablets, and even mobile devices. Each device requires slightly different UI elements. A UI component factory ensures that
users get a consistent, yet device-tailored, experience without cluttering the main application logic with device checks.
4. Cloud Resource Provisioning:
The Situation: Imagine a cloud management dashboard within Google Cloud Platform that lets Engineers select and deploy
different cloud resources. The can choose VMs, databases, or storage buckets. A factory here helps abstract and simplify
the provisioning process for each resource type. The factory can produce the correct provisioner based on the selected 
cloud resource.
5. Middleware/ Integration Connectors:
The Situation: Suppose your company's ERP system now supports third party integrations. A client wants to synchronize data between
your ERP and their in house CRM system. By employing a connector factory, the system can elegantly fetch or push data 
using the right connector without messy switch-case structures. A factory can instantiate the appropriate connector or 
handler based on the third party service. A factory can instantiate the appropriate connector or integration handler 
based on the third-party service.
6. Payment Gateway Integration:
The Situation: You venture into an e-commerce solutions. A client in Europe wants to offer multiple payment options: PayPal for
international customers, Sofort for German customers, and iDEAL for Dutch ones. A payment gateway factory handles these 
diverse payment methods, ensuring smooth transactions. 
7. Logging Mechanism:
The Situation: You are new IoT platform gathers logs from devices. Some logs are critical and stored in high speed storage, while others 
are archived in cloud storage. A logging factory determines the urgency and nature of logs and routes them appropriately.
8. Data Serialization Formats:
The Situation: cloud backup service offers users flexibility in how they store their backup data: JSON for configuration data, XML for 
legacy applications, and Protocol Buffers for efficient storage. A serialization factory makes this seamless, encoding 
and decoding data based on the chosen format.
9. Reporting Modules:
The situation: In a yearly sales summit, regional managers use an analytics tool to present their performance. One prefers
bar charts, another pie charts, while another loves tabular data. A report factory in the tool caters to their diverse 
preferences, generating the desired report format on demand. 

---

## Adherence to Software Engineering Principles
1. Open/ Closed Principle (OCP):
The Factory Pattern adheres to this principle because it allows the code to introduce new types of product without 
modifying the existing client code. The factory could be extended to support the creating of new products, hence its 
open for extension but closed for modification.
2. Single Responsibility Principle (SRP):
A well-designed factory takes on one responsibility -creating objects and encapsulating the logic of object creation, 
thus adhering to SRP
3. Dependency Inversion Principle (DIP):
Factories depend on abstract entities, not concrete ones. This means they typically rely on interfaces or abstract
classes, rather than concrete classes, which is a direct application of DIP
4. Interface Segregation Principle (ISP):
The Factory Pattern promotes the use of specific interfaces rather than one interface that does everything. Clients 
only need to know about the interface that is responsible for object creation, not the details of object implementation.
5. Substitution Principle (LSP):
If your factory returns on an object of a type that adheres to LSP, it implies that the objects created by the factory
can be substituted for their superclass type  without affecting the program.

---

## Potential Violations or Concerns:
1. Open/ Closed Principle (OCP):
Although the pattern is mostly aligned with OCP, it can violate this principle if the factory itself needs to be 
modified to add new types of products, which would require changing the factory's code.
2. Single Responsibility Principle (SRP):
In complex systems, a factory might take on additional responsibilities such as lifecycle management or dependency
injection for the objects it creates, which could lead to SRP violation.
3. Interface Segregation Principle (ISP):
If the factory directly instantiates concrete classes rather than relying on abstractions, it could violate DIP.
4. Encapsulation:
The Factory Pattern could potentially expose details of object creation that should be encapsulated within the object 
itself. This is not a violation of a principle per se, but rather a concern about the balance between the benefits of 
using the pattern and maintaining encapsulation.

The Factory Design Pattern is usually a good fit with the fundamental software engineering principles, promoting clean, 
maintainable, and scalable code. However, like all design patterns, it should be applied judiciously and modified as 
needed to fit the context and specific requirements of the software being developed.
