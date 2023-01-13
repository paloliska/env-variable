# env-variable Project

This project demonstrates bug: property not set from env variable.
Test is based on [quarkus config reference guide](https://quarkus.io/guides/config-reference#system-properties)

To test run:
```bash
export PROPERTY_MAP_ENV=exist; java -jar ./target/quarkus-app/quarkus-run.jar 
```

Property should be printed in log as
```
env: exist
```
but is not.