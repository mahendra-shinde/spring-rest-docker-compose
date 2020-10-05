## Deploying the sample SpringBoot Application on Kubernetes

1.  Please deploy the components in `following order` only

    ```bash
    $ kubectl apply -f dbconfig.yml
    $ kubectl apply -f db-deploy.yml
    $ kubectl apply -f db-service.yml
    ## Wait for 3/4 minutes
    $ kubectl apply -f app-deploy.yml
    $ kubectl apply -f app-service.yml
    ```

2.  If you are using docker-desktop or minikube based kubernetes use following URLs to try REST API

    `http://localhost:8080/api/customers/C00001`

    `http://localhost:8080/api/customers/`