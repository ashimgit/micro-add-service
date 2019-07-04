# micro-add-service
This is part of spring bootmicro service, Add service

Docker :

1. To Communicate to each other container in localhost environment :

	i. Setup a network of type "bridge" :
		==$docker network create mynet
		
	ii. List the network :
	
		==$docker network ls
NETWORK ID          NAME                DRIVER              SCOPE
e7347931de0b        bridge              bridge              local
e5a6ec9b2852        docnet              bridge              local
a7db225231e3        host                host                local
462a124c2a40        mynet               bridge              local
d9d4a8810463        none                null                local
==$

	iii. Run the Docker image with having a name :
		==$docker run --network mynet --name docker-add-service -p 12345:12345 docker-add-service
		
		
		Now every docker container will recognize the service as "docker-add-service" instead of IP/"localhost"
		Like : http://docker-add-service:12345
		
