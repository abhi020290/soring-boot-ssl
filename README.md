# spring-boot-ssl
spring-boot-ssl

JKS
            
    keytool -genkeypair -alias sample_pc12file -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore sample_pc12file.p12 -validity 3650

PKCS12 

    keytool -genkeypair -alias sample_jksfile -keyalg RSA -keysize 2048 -storetype JKS -keystore sample_jksfile.jks -validity 3650

import
    
    keytool -importkeystore -srckeystore sample_jksfile.jks -destkeystore sample_pc12file.p12 -deststoretype pkcs12

List: 

        keytool -list -keystore https-springboot.jks
        Enter keystore password:

List verbose:

        keytool -list -v -keystore https-springboot.jks
        Enter keystore password:

Using alias:

    keytool -list -alias <aliasName> -keystore https-springboot.jks
    Enter keystore password:
