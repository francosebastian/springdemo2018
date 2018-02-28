# springdemo2018
A spring demo for job interview

_**Run MySQL Server in Docker container by:**_

docker run --name springdemo-mysql -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=demo -e MYSQL_USER=demo_user -e MYSQL_PASSWORD=demo_pass -p 3306:3306 -d mysql:5.6


`To see the logging output from MySQL Server, and make sure the server is running OK.
`

**docker logs springdemo-mysql** 

 **Mac OSX and Boot2Docker**, the Docker host is not local, but in a different VM. Run boot2docker ip to get the IP address of the VM, then use this IP address to access the MySQL Server through SQL Client UI Tool. For example, Boot2Docker IP usually is 192.168.59.103, so I used MySQL Workbench to open a connection to it, with user demo-user, password demo-pass, to make sure the Server can be connected, and an empty database demo in there.

If you are using **Linux**, and you have MySQL Server running locally with stabdard port 3306, you may have to change the expoed port to different number, like 3307. So the running command will be:

docker run --name demo-mysql -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=demo -e MYSQL_USER=demo_user -e MYSQL_PASSWORD=demo_pass -p 3307:3306 -d mysql:5.6 

And you can access the server by localhost:3307/demo


