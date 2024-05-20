# Minimalistic IO
A simple Java library to interact with files, folders and get user input. Hecho en 🇵🇷 por Radamés J. Valentín Reyes.
## Imports
~~~java
import java.io.FileNotFoundException;
import java.io.IOException;
~~~
## Methods
IO Class
Print
~~~java
IO.print("Hello World");
~~~
Create file. Creates all of the required folders in the path and the file.
~~~java
IO.createFile(filePath);
~~~
Write a String to an existing file
~~~java
IO.writeAsString(filePath, data);
~~~
Read file contents as String
~~~java
IO.readAsString(filePath);
~~~
Delete directory(including the files and folders contained).
~~~java
IO.deleteDirectory("./database");
~~~