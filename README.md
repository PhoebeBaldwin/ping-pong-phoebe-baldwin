# ping-pong-phoebe-baldwin

Here is my solution to the Anzo Group application.

To run install an IDE, this was developed using Eclipse so this is recommended. 

Then download this Git Repository. 

Next import the Git Repository into the IDE 

Now run the application. 

The application uses the port 8080 and if there is already an application running on this port then it will fail to load. 

to fix this go type cmd in the windows bar and enter. 

then enter netstat -ano | findstr :8080 to find the processes using the port

and then taskkill /PID <PID number> /F to kill this process


