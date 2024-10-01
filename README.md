# SEMOSS Project 
 
## Welcome 
 
Hello and welcome to the SEMOSS project. We have a few important steps for you to take to initialize the process of downloading SEMOSS. It is a lengthy process, and the goal is for you to be able to set a few parameters and download a few items, and then step away while our automation process does the rest. If you are downloading for the first time, this process could take anywhere from 30 minutes to an hour*. Do not be alarmed if your first installation process takes up your entire day. 
 
For returning SEMOSS users who need to download specific things, please see the properties file section. 
 
## JDK 
 
First things first, we need you to download a Java SE Development Kit (JDK). Through this link: [Oracle JDK Downloads](https://www.oracle.com/java/technologies/javase/javase8u211-later-archive-downloads.html) you can scroll down to find set, Windows x64 for 64 bit. Accept the license agreement and download. You will need to create an Oracle account using your Deloitte email address (if you do not receive an email confirmation within 10-15 minutes, contact a training team member, who will provide a backup email). Select next all the way through it will go to your Program Files but you won't have to direct it there (if you run into any issues, right click the download and choose "Run as Administrator"). 
 
## Properties File 
 
For our automation to know exactly what you want to download and where you want to download it to, we need you to edit the properties file. This file is called `master.properties`. The purpose of this file is to flag certain software as true or false. A true marker means that the software will be installed, false means that it won’t be installed. The individual software flags only work if _**softwareInstall**_ is true. Someone that has never downloaded any aspects of SEMOSS before would have a properties file that looks similar to this:

---screenshot of master.properties where all flags are set to the values are set for a first time download --------

Notice how you can also choose to set your path variable. This is where your workspace within Eclipse would be located. First time installers usually want their workspace in their C drive, like so: 

---screenshot of master.properties where the workspace/ path variable/ eclipse are set for first timers --------

But if you are creating a different workspace to play around in, pick whatever path you’d like. A returning user would potentially set some installation values to false, if they already exist on your machine.

## VS Installer

VS Installer is something that all new SEMOSS developers need to install. There are a few “user inputs” required to complete the installation. VS Installer should automatically run and open up VS Build Tools. You should be greeted with a screen that looks like this:

![image](https://github.com/user-attachments/assets/a07d5266-98f0-4eab-9b5d-23a65d8e20de)

Click on the ”Modify” button on the right side. There’s a chance that step skips altogether and it takes you straight into the modify screen:

![image](https://github.com/user-attachments/assets/23f97da3-fe67-4ad6-b40b-20984648660e)

Check the box that says ”Desktop Development with C++”. On the right side there is an ”Installation Details” section. Check each checkbox in this Optional section. Download and install the selection.

## Last Steps

At this point, the rest of the installation should be done automatically. Once the process is complete, Eclipse should be launched for you.  

### Starting your Server

- Starting the server yourself: At the bottom of Eclipse, next to the Console tab, you should see a tab labeled “Servers”.  Right click on Tomcat and select the “Start” button. Give your server a few minutes to start. You can watch the console’s output as your server starts to view the progress. Once your server has been started, go to this website to start using SEMOSS. [SEMOSS](http://localhost:9090/SemossWeb/#!/)

![image](https://github.com/user-attachments/assets/5a7e266a-a7bd-4681-a13e-0e8500bf07aa)

 - If the server is started through the batch file: The server should start on it’s own and the SEMOSS website should be opened. If you do not see SEMOSS web UI, try refreshing the page.

![image](https://github.com/user-attachments/assets/89d5bc0a-6094-406a-a2e2-7cb005a4e274)
