# AMT - WP2

## Comment
Unfortunately, we didn't follow the webcasts from the beginning of the project,
this caused us several problems, specifically for modifications on the Swagger specification.
Indeed, we didn't use Swagger-codgen directly form IntelliJ but form the web interface. The application is functionnal but is thereby difficult to maintain.
Due to this error, the "events" tests were difficult to write because we didn't correctly
plan the POSTs operations that don't return the persisted entity.

## Deploy

### Spring-server

#### With IntelliJ:
- `File > Open`
- Select `Spring-server`
- Click to install dependencies on the bottom-right popup
- Run the project

#### With docker-compose:
- `cd topology-amt`
- `docker-compose up`

### Tests

#### With IntelliJ:
- `File > Open`
- Select `gamification-specs`
- Click to install dependencies on the bottom-right popup
- `File > Project structure`
- In the left panel choose `Modules` and click on `+` and `Import module`
- Choose the `Client file from the project`
- Choose `Maven > Next > Next > Next > Finish`
- Apply changes and click Ok
- Run the project
