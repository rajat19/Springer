## Springer Application

This is a practice application developed to understand all flows present in a spring boot application

The project uses gradle rather than conventional maven project manager.

Gradle is faster in compiling files when compared with Maven or Ant.

---
### Run project
```shell
./gradlew bootRun
```

---
### Helpers

**- Self-signed certificate:** To create a self-signed certificate, Java Run Time environment comes bundled with certificate management utility key tool. This utility tool is used to create a Self-Signed certificate.
```shell
keytool -genkey -alias tomcat -storetype PKCS12 -keyalg RSA -keysize 2048 -keystore keystore.p12 -validity 3650
```