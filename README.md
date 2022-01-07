# DockerComposeEx1
Using docker compose we can easily develop multi container applications.

We need to create docker-compose.yaml file.

docker compose up -> Starting our application. (Use docker-compose up -d for starting docker compose in background)

Above command will create/pull relevant images and spin up  relevant containers using them.

After creating relevant containers by docker compose,  we need to create the relevant mysql db and table by logging
into mysql container.(Mysql commands are included in db.sql file)

docker compose down

Above command Stop all the containers related to this application.

http://localhost:8080/DockerComposeEx1/ -> Access our web application in web browser.