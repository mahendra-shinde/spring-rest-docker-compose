# Containerized Spring REST (Using spring boot)

## Software Setup:

- Open JDK 8
- Visual Studio code (for code editing)
- Apache Maven 3.6 (Build/Test and Run)
- Docker (Container daemon)

1. Clone the current repository using following command:

   ```cmd
   $ mkdir /my-demos
   $ cd /my-demos
   $ git clone https://github.com/mahendra-shinde/spring-rest-docker-compose
   $ cd spring-rest-docker-compose
   ```

2. You need to build java project using maven.

   ```
   $ cd api-app
   $ mvn package -DskipTests
   ```

3. Now, that application is built, go back to repository root folder and trigger container image build for both DB and APP.

   ```
   $ cd /my-demos/spring-rest-docker-compose
   $ docker-compose build
   ```

4. Building image might take more than 10/15 minutes depending on network speed and locally available base images. Once build completes, try running application and it's database.

   ```
   $ docker-compose up -d
   ## check the status
   $ docker-compose ps
   ```

5. APP container would crash first as database might not be ready at first. just wait for it to restart automatically. and then access website at following address:

   http://localhost:8080
