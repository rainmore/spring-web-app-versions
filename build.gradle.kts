plugins {
    id("version-catalog")
}

defaultTasks("generateCatalogAsToml")

catalog {
    versionCatalog {
        val scalaBranchVersion: String = "_2.13"

        version("scala-library", "2.13.6")
        version("scala-java8-compat", "0.9.1")

        version("groovy", "3.0.8")
        version("kotlin", "1.5.21")

        version("typesafe-logging", "3.9.2")
        version("typesafe-config", "1.4.1")

        version("thymeleaf-core", "3.0.12.RELEASE")
        version("thymeleaf-extra", "3.0.4.RELEASE")
        version("thymeleaf-layout", "2.5.3")

        version("jackson", "2.12.4")

        version("slf4j", "1.7.31")
        version("logback", "1.2.3")

        version("spring-framework", "5.3.8")
        version("spring-boot", "2.5.2")
        version("spring-security-main", "5.5.1")
        version("spring-security-oauth2", "2.2.0.RELEASE")
        version("spring-integration-mail", "5.5.2")

        version("scalatest", "3.2.3")
        version("jfairy", "0.6.4")
        version("scalatestplus-junit", "1.0.0-M2")

        version("mysql-connector", "8.0.26")
        version("hikaricp", "4.0.3")
        version("hibernate-core", "5.4.32.Final")
        version("hibernate-validator", "6.2.0.Final")
        version("hibernate-jpa-api", "1.0.2.Final")
        version("querydsl", "4.4.0")

        version("javax-validation-api", "2.0.1.Final")
        version("javax-annotation-api", "1.3.2")
        version("javax-inject", "1")
        version("javax-servlet-api", "4.0.1")

        version("commons-lang3", "3.12.0")
        version("commons-email", "1.5")
        version("commons-codec", "1.15")
        version("commons-validator", "1.7")
        version("commons-csv", "1.8")
        version("commons-io", "2.11.0")
        version("commons-net", "3.8.0")
        version("bouncycastle-bcmail", "1.69")

        version("passay", "1.6.1")
        version("webjars-locator", "0.40")

        version("flyway-core", "7.11.3")


        alias("kotlin-stdlib").to("org.jetbrains.kotlin", "kotlin-stdlib").versionRef("kotlin")
        alias("kotlin-reflect").to("org.jetbrains.kotlin", "kotlin-reflect").versionRef("kotlin")
        alias("kotlin-test-core").to("org.jetbrains.kotlin", "kotlin-test").versionRef("kotlin")
        alias("kotlin-test-junit").to("org.jetbrains.kotlin", "kotlin-test-junit").versionRef("kotlin")

        alias("javax-annotation-api").to("javax.annotation", "javax.annotation-api").versionRef("javax-annotation-api")
        alias("hibernate-jpa-api").to("org.hibernate.javax.persistence", "hibernate-jpa-2.1-api").versionRef("hibernate-jpa-api")

        alias("querydsl-apt").to("com.querydsl", "querydsl-apt").versionRef("querydsl")
        alias("querydsl-jpa").to("com.querydsl", "querydsl-jpa").versionRef("querydsl")

        alias("mysql-connector").to("mysql", "mysql-connector-java").versionRef("mysql-connector")
        alias("hikaricp").to("com.zaxxer", "HikariCP").versionRef("hikaricp")

        alias("hibernate-core").to("org.hibernate", "hibernate-core").versionRef("hibernate-core")
        alias("hibernate-entitymanager").to("org.hibernate", "hibernate-entitymanager").versionRef("hibernate-core")
        alias("hibernate-java8").to("org.hibernate", "hibernate-java8").versionRef("hibernate-core")
        alias("hibernate-validator").to("org.hibernate.validator", "hibernate-validator").versionRef("hibernate-validator")
        alias("javax-validation-api").to("javax.validation", "validation-api").versionRef("javax-validation-api")


        alias("scala-library").to("org.scala-lang", "scala-library").versionRef("scala-library")
        alias("scala-java8-compat").to("org.scala-lang.modules", "scala-java8-compat" + scalaBranchVersion).versionRef("scala-java8-compat")
        alias("typesafe-logging").to("com.typesafe.scala-logging", "scala-logging" + scalaBranchVersion).versionRef("typesafe-logging")
        alias("typesafe-config").to("com.typesafe", "config").versionRef("typesafe-config")


        alias("thymeleaf-core").to("org.thymeleaf", "thymeleaf").versionRef("thymeleaf-core")
        alias("thymeleaf-spring5").to("org.thymeleaf", "thymeleaf-spring5").versionRef("thymeleaf-core")
        alias("thymeleaf-springsecurity5").to("org.thymeleaf.extras", "thymeleaf-extras-springsecurity5").versionRef("thymeleaf-extra")
        alias("thymeleaf-java8time").to("org.thymeleaf.extras", "thymeleaf-extras-java8time").versionRef("thymeleaf-extra")
        alias("thymeleaf-layout").to("nz.net.ultraq.thymeleaf", "thymeleaf-layout-dialect").versionRef("thymeleaf-layout")

        alias("jackson-core").to("com.fasterxml.jackson.core", "jackson-core").versionRef("jackson")
        alias("jackson-datatype-jdk8").to("com.fasterxml.jackson.datatype", "jackson-datatype-jdk8").versionRef("jackson")
        alias("jackson-datatype-jsr310").to("com.fasterxml.jackson.datatype", "jackson-datatype-jsr310").versionRef("jackson")
        alias("jackson-datatype-hibernate5").to("com.fasterxml.jackson.datatype", "jackson-datatype-hibernate5").versionRef("jackson")
        alias("jackson-module-kotlin").to("com.fasterxml.jackson.module", "jackson-module-kotlin",).versionRef("jackson")
        alias("jackson-module-scala").to("com.fasterxml.jackson.module", "jackson-module-scala" + scalaBranchVersion).versionRef("jackson")

        alias("slf4j-api").to("org.slf4j", "slf4j-api").versionRef("slf4j")
        alias("log4j-over-slf4j").to("org.slf4j", "log4j-over-slf4j").versionRef("slf4j")
        alias("logback-classic").to("ch.qos.logback", "logback-classic").versionRef("logback")
        alias("logback-core").to("ch.qos.logback", "logback-core").versionRef("logback")
        alias("groovy-core").to("org.codehaus.groovy", "groovy").versionRef("groovy")

        alias("spring-integration-mail").to("org.springframework.integration", "spring-integration-mail").versionRef("spring-integration-mail")

        alias("commons-lang3").to("org.apache.commons", "commons-lang3").versionRef("commons-lang3")
        alias("commons-email").to("org.apache.commons", "commons-email").versionRef("commons-email")
        alias("commons-codec").to("commons-codec", "commons-codec").versionRef("commons-codec")
        alias("commons-validator").to("commons-validator", "commons-validator").versionRef("commons-validator")

        alias("commons-csv").to("org.apache.commons", "commons-csv").versionRef("commons-csv")
        alias("commons-io").to("commons-io", "commons-io").versionRef("commons-io")
        alias("commons-net").to("commons-net", "commons-net").versionRef("commons-net")

        alias("bouncycastle-bcmail").to("org.bouncycastle", "bcmail-jdk15on").versionRef("bouncycastle-bcmail")

        alias("javax-inject").to("javax.inject", "javax.inject").versionRef("javax-inject")
        alias("javax-servlet-api").to("javax.servlet", "javax.servlet-api").versionRef("javax-servlet-api")
        alias("passay").to("org.passay", "passay").versionRef("passay")

        alias("webjars-locator").to("org.webjars", "webjars-locator").versionRef("webjars-locator")

        alias("flyway-core").to("org.flywaydb", "flyway-core").versionRef("flyway-core")

        alias("jfairy").to("com.devskiller", "jfairy").versionRef("jfairy")

        alias("scalactic").to("org.scalactic", "scalactic" + scalaBranchVersion).versionRef("scalatest")
        alias("scalatest").to("org.scalatest", "scalatest" + scalaBranchVersion).versionRef("scalatest")
        alias("scalatestplus-junit").to("org.scalatestplus", "scalatestplus-junit" + scalaBranchVersion).versionRef("scalatestplus-junit")

        bundle("kotlin-core", listOf("kotlin-stdlib", "kotlin-reflect"))
        bundle("kotlin-test", listOf("kotlin-test-core", "kotlin-test-junit"))
        bundle("scala", listOf("scala-library", "scala-java8-compat", "typesafe-logging", "typesafe-config"))
        bundle("logging", listOf("slf4j-api", "log4j-over-slf4j", "logback-classic", "logback-core", "jackson-module-kotlin", "jackson-module-scala"))
        bundle("thymeleaf", listOf("thymeleaf-core", "thymeleaf-spring5", "thymeleaf-springsecurity5", "thymeleaf-java8time", "thymeleaf-layout"))
        bundle("jackson", listOf("jackson-core", "jackson-datatype-jdk8", "jackson-datatype-jsr310", "jackson-datatype-hibernate5", "jackson-module-kotlin", "jackson-module-scala"))
        bundle("jpa-hibernate", listOf("hikaricp", "hibernate-core", "hibernate-entitymanager", "hibernate-java8", "hibernate-validator", "javax-validation-api", "commons-validator"))
        bundle("test", listOf("jfairy", "scalactic", "scalatest", "scalatestplus-junit"))

        bundle("misc", listOf("javax-inject", "commons-lang3", "commons-email", "commons-codec", "commons-csv", "commons-io", "commons-net",
                        "bouncycastle-bcmail", "passay"))

    }
}
