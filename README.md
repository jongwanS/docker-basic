# docker-basic

##project build##
1. clean and build - compile and make jar file(compile) 
> mvn clean package

2. Dockerfile 로 부터 이미지 빌드하기 - 이름을 docker-study:1.0.0 . 로 이미지 빌드, tag 는 버전
> docker build -t(ag) docker-study:1.0.0 .

3. 빌드된 이미지 체크
> docker images

4. 이미지화된 도커 실행 - docker run 
  - d : 백그라운드 실행 Run container in background and print container ID
  - p : Publish a container's port(s) to the host , 내부 80번 포트 > 8080 으로포팅 
> docker run -d -p 80:8080 docker-study:1.0.0

5. 도커 컨테이너 확인 check docker container
> docker ps -f name={random name by docker}

6. 생성된 이미지 확인 
> http://{your_domain}/dummyGet 

7. 컨테이너 멈추기 docker stop
> docker stop {container_name}



##docker basic command##
docker ps : 컨테이너 확인
docker ps -a : 정지된 컨테이너확인
docker images : 도커이미지 확인
docker rmi {image_name} : 이미지삭제
docker rm  {container_id},{container_id} : 컨테이너 삭제
