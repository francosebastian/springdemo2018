# springdemo2018
A spring demo for job interview

Run MySQL Server in Docker container by:

docker run --name demo-mysql -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=demo -e MYSQL_USER=demo_user -e MYSQL_PASSWORD=demo_pass -p 3306:3306 -d mysql:5.6
