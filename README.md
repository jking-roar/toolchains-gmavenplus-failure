# toolchains-gmavenplus-failure
To illustrate the problem with gmavenplus compilation in a project with toolchains integration

- toolchains.xml must be at $M2_HOME/toolchains.xml, with paths correctly specifying Java 6 and Java 8 locations.
- If JAVA_HOME is set to the Java 6 home, then this project fails to build
- If JAVA_HOME is set to the Java 8 home, then this project builds successfully
