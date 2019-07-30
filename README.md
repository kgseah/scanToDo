# scanToDo
This script is to help developer to scan for "TODO" in node.js or golang (.go) file
The script will list the file path base on user input and check if there is TODO word in code 

# Prerequisite
This require java 8 to be install in the machine

For WINDOWS 10
https://www.java.com/en/download/faq/win10_faq.xml

Alternatively can run the command below
"chocolatey install java 8"

For MAC
Kindly follow the guide on the link below
https://java.com/en/download/help/mac_install.xml

Alternatively
"brew cask install java"


For linux
Kindly follow the guide on the link below
https://java.com/en/download/help/linux_x64_install.xml

centos/rhel: 
"sudo yum install java-1.8.0-openjdk"

ubuntu: 
"sudo apt install openjdk-8-jdk "

# To run

"java -jar scanToDo-1.0-SNAPSHOT.jar"


# Expected output

------------------------------------
Scanning for below file type
.js .go
------------------------------------
Enter the path to scan:

c:\test

c:\test\subfolder\subsubfolder\hello.go -- Line number 1

c:\test\subfolder\subsubfolder\hello.go -- Line number 9

c:\test\subfolder\test.js -- Line number 1
