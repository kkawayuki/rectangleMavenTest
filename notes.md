General Maven info
    rectangle-maven/
    ├── pom.xml                                  ← project config
    ├── src/main/java/rectangle/Rectangle.java   ← your class (package renamed to lowercase)
    ├── src/test/java/rectangle/RectangleTest.java ← 6 JUnit tests
    └── target/                                  ← Maven's output (created by the build)

    pom.xml
    - project identity: Group name, project name, version
    - dependencies: JUnit (downloaded by maven automatically)
    - plugins: Java compileer, test runner, PIT 

    Everyday commands
    Run these from inside rectangle-maven/:

    Command	        What it does
    mvn compile	    Compiles src/main/java into target/classes. This replaces running javac yourself.
    mvn test	    Compiles everything, then runs the tests.
    mvn package	    Runs the tests, then bundles the compiled code into target/rectangle-1.0-SNAPSHOT.jar.
    mvn clean	    Deletes target/ so the next build starts fresh.
    mvn test-compile org.pitest:pitest-maven:mutationCoverage       runs PIT

    high-level explanation 
    - maven used mainly to shortcut the dependency downloading process for large projects
    - this way, highly-complex projects can be ran quickly from other devices given a single command

Folder organization
- handled by maven's movement into folders within project source
- moves compiled .class files into the target folder
- main folder
- test folder 

Mvn testing
- goes down list of compilation steps for 
- check resources of class
- compilation of .java
- check resources of tests 
- compiles tests if needed
- afterwards runs tests (end)
    - simply runs the manually created tests 

Mvn PIT testing 
- shows terminal feedback, saves report data to the target\pit-reports\index.html file
- can use: start target\pit-reports\index.html to open it in browser
    - runs it directly from your local files on pc 

Mutation testing in general
- measures in general, how good your tests are at catching buds
- catches tests that run code without asserting enough about it, or without trying the important inputs.
    - goes line-by-line through your source code and gives insight into which lines were 
    - 1) skipped (normal behavior for tests)
    - 2) not tested specifically enough (unique to mutation testing)

