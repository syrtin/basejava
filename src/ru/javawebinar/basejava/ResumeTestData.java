package ru.javawebinar.basejava;

import ru.javawebinar.basejava.model.*;
import ru.javawebinar.basejava.util.DateUtil;

import java.time.LocalDate;
import java.util.*;

public class ResumeTestData {

    public static Resume createResume(String uuid, String fullName) {
        Map<ContactType, String> contacts = new EnumMap<>(ContactType.class);
        Map<SectionType, AbstractSection> sections = new EnumMap<>(SectionType.class);

        contacts.put(ContactType.PHONE_NUMBER, "79112223344");
        contacts.put(ContactType.SKYPE, "skype");
        contacts.put(ContactType.EMAIL, "mail@yandex.ru");
        contacts.put(ContactType.LINKEDIN, "https://www.linkedin.com/in/linkedin");
        contacts.put(ContactType.GITHUB, "https://github.com/github");
        contacts.put(ContactType.STACKOVERFLOW, "https://stackoverflow.com/users/stackoverflow");
        contacts.put(ContactType.HOMEPAGE, "http://homepage.ru/");

        sections.put(SectionType.OBJECTIVE, new SimpleLineSection("Objective"));
        sections.put(SectionType.PERSONAL, new SimpleLineSection("Personal"));

        List<String> achievements = new LinkedList<>();
        achievements.add("Achievement1");
        achievements.add("Achievement2");
        achievements.add("Achievement3");
        sections.put(SectionType.ACHIEVEMENT, new BulletedListSection(achievements));

        List<String> qualifications = new ArrayList<>();
        qualifications.add("Qualification1");
        qualifications.add("Qualification2");
        qualifications.add("Qualification3");
        sections.put(SectionType.ACHIEVEMENT, new BulletedListSection(qualifications));

        List<Organization> organization = new ArrayList<>();
        organization.add(new Organization("Organization1",
                "https://www.organization1.com/",
                new Experience("java-developer1",
                        "develop1",
                        DateUtil.of(2021, 1),
                        LocalDate.now())));
        organization.add(new Organization("Organization2",
                "https://www.organization2.com/",
                new Experience("java-developer2",
                        "develop2",
                        DateUtil.of(2016, 1),
                        DateUtil.of(2021, 1))));
        organization.add(new Organization("Organization3",
                null,
                new Experience("java-developer3",
                        "develop3",
                        DateUtil.of(2011, 1),
                        DateUtil.of(2016, 1))));
        sections.put(SectionType.EXPERIENCE, new OrganizationSection(organization));

        List<Organization> education = new ArrayList<>();
        education.add(new Organization("education1",
                "https://www.education1.org/course/",
                new Experience("experience1",
                        null,
                        DateUtil.of(2021, 1),
                        LocalDate.now())));
        education.add(new Organization("education2",
                "http://www.education2.ru/",
                new Experience("experience2",
                        null,
                        DateUtil.of(2006, 1),
                        DateUtil.of(2011, 1)),
                new Experience("experience3",
                        null,
                        DateUtil.of(2001, 1),
                        DateUtil.of(2011, 1))));
        sections.put(SectionType.EDUCATION, new OrganizationSection(education));

        Resume result = new Resume(uuid, fullName);
        result.setContacts(contacts);
        result.setSections(sections);
        return result;
    }

    public static void main(String[] args) {
        Map<ContactType, String> contacts = new EnumMap<>(ContactType.class);
        Map<SectionType, AbstractSection> sections = new EnumMap<>(SectionType.class);

        contacts.put(ContactType.PHONE_NUMBER, "79218550482");
        contacts.put(ContactType.SKYPE, "grigory.kislin");
        contacts.put(ContactType.EMAIL, "gkislin@yandex.ru");
        contacts.put(ContactType.LINKEDIN, "https://www.linkedin.com/in/gkislin");
        contacts.put(ContactType.GITHUB, "https://github.com/gkislin");
        contacts.put(ContactType.STACKOVERFLOW, "https://stackoverflow.com/users/548473");
        contacts.put(ContactType.HOMEPAGE, "http://gkislin.ru/");

        sections.put(SectionType.OBJECTIVE, new SimpleLineSection("Ведущий стажировок и корпоративного обучения по Java Web и Enterprise технологиям"));
        sections.put(SectionType.PERSONAL, new SimpleLineSection("Аналитический склад ума, сильная логика, креативность, инициативность. Пурист кода и архитектуры."));

        List<String> achievements = new LinkedList<>();
        achievements.add("С 2013 года: разработка проектов \"Разработка Web приложения\",\"Java Enterprise\", \"Многомодульный maven. Многопоточность. XML (JAXB/StAX). Веб сервисы (JAX-RS/SOAP). Удаленное взаимодействие (JMS/AKKA)\". Организация онлайн стажировок и ведение проектов. Более 1000 выпускников.");
        achievements.add("Реализация двухфакторной аутентификации для онлайн платформы управления проектами Wrike. Интеграция с Twilio, DuoSecurity, Google Authenticator, Jira, Zendesk.");
        achievements.add("Налаживание процесса разработки и непрерывной интеграции ERP системы River BPM. Интеграция с 1С, Bonita BPM, CMIS, LDAP. Разработка приложения управления окружением на стеке: Scala/Play/Anorm/JQuery. Разработка SSO аутентификации и авторизации различных ERP модулей, интеграция CIFS/SMB java сервера.");
        achievements.add("Реализация c нуля Rich Internet Application приложения на стеке технологий JPA, Spring, Spring-MVC, GWT, ExtGWT (GXT), Commet, HTML5, Highstock для алгоритмического трейдинга.");
        achievements.add("Создание JavaEE фреймворка для отказоустойчивого взаимодействия слабо-связанных сервисов (SOA-base архитектура, JAX-WS, JMS, AS Glassfish). Сбор статистики сервисов и информации о состоянии через систему мониторинга Nagios. Реализация онлайн клиента для администрирования и мониторинга системы по JMX (Jython/ Django).");
        achievements.add("Реализация протоколов по приему платежей всех основных платежных системы России (Cyberplat, Eport, Chronopay, Сбербанк), Белоруcсии(Erip, Osmp) и Никарагуа.");
        sections.put(SectionType.ACHIEVEMENT, new BulletedListSection(achievements));

        List<String> qualifications = new ArrayList<>();
        qualifications.add("JEE AS: GlassFish (v2.1, v3), OC4J, JBoss, Tomcat, Jetty, WebLogic, WSO2");
        qualifications.add("Version control: Subversion, Git, Mercury, ClearCase, Perforce");
        qualifications.add("DB: PostgreSQL(наследование, pgplsql, PL/Python), Redis (Jedis), H2, Oracle,");
        qualifications.add("MySQL, SQLite, MS SQL, HSQLDB");
        qualifications.add("Languages: Java, Scala, Python/Jython/PL-Python, JavaScript, Groovy,");
        qualifications.add("XML/XSD/XSLT, SQL, C/C++, Unix shell scripts,");
        qualifications.add("Java Frameworks: Java 8 (Time API, Streams), Guava, Java Executor, MyBatis, Spring (MVC, Security, Data, Clouds, Boot), JPA (Hibernate, EclipseLink), Guice, GWT(SmartGWT, ExtGWT/GXT), Vaadin, Jasperreports, Apache Commons, Eclipse SWT, JUnit, Selenium (htmlelements).");
        qualifications.add("Python: Django.");
        qualifications.add("JavaScript: jQuery, ExtJS, Bootstrap.js, underscore.js");
        qualifications.add("Scala: SBT, Play2, Specs2, Anorm, Spray, Akka");
        qualifications.add("Технологии: Servlet, JSP/JSTL, JAX-WS, REST, EJB, RMI, JMS, JavaMail, JAXB, StAX, SAX, DOM, XSLT, MDB, JMX, JDBC, JPA, JNDI, JAAS, SOAP, AJAX, Commet, HTML5, ESB, CMIS, BPMN2, LDAP, OAuth1, OAuth2, JWT.");
        qualifications.add("Инструменты: Maven + plugin development, Gradle, настройка Ngnix,");
        qualifications.add("администрирование Hudson/Jenkins, Ant + custom task, SoapUI, JPublisher, Flyway, Nagios, iReport, OpenCmis, Bonita, pgBouncer.");
        qualifications.add("Отличное знание и опыт применения концепций ООП, SOA, шаблонов проектрирования, архитектурных шаблонов, UML, функционального программирования");
        qualifications.add("Родной русский, английский \"upper intermediate\"");
        sections.put(SectionType.ACHIEVEMENT, new BulletedListSection(qualifications));

        List<Organization> organization = new ArrayList<>();
        organization.add(new Organization("Java Online Projects",
                "http://javaops.ru/",
                new Experience("Автор проекта.",
                        "Создание, организация и проведение Java онлайн проектов и стажировок.",
                        DateUtil.of(2013, 10),
                        LocalDate.now())));
        organization.add(new Organization("Wrike",
                "https://www.wrike.com/",
                new Experience("Старший разработчик (backend)",
                        "Проектирование и разработка онлайн платформы управления проектами Wrike (Java 8 API, Maven, Spring, MyBatis, Guava, Vaadin, PostgreSQL, Redis). Двухфакторная аутентификация, авторизация по OAuth1, OAuth2, JWT SSO.",
                        DateUtil.of(2014, 10),
                        DateUtil.of(2016, 1))));
        organization.add(new Organization("RIT Center",
                null,
                new Experience("Java архитектор",
                        "Организация процесса разработки системы ERP для разных окружений: релизная политика, версионирование, ведение CI (Jenkins), миграция базы (кастомизация Flyway), конфигурирование системы (pgBoucer, Nginx), AAA via SSO. Архитектура БД и серверной части системы. Разработка интергационных сервисов: CMIS, BPMN2, 1C (WebServices), сервисов общего назначения (почта, экспорт в pdf, doc, html). Интеграция Alfresco JLAN для online редактирование из браузера документов MS Office. Maven + plugin development, Ant, Apache Commons, Spring security, Spring MVC, Tomcat,WSO2, xcmis, OpenCmis, Bonita, Python scripting, Unix shell remote scripting via ssh tunnels, PL/Python",
                        DateUtil.of(2012, 4),
                        DateUtil.of(2014, 10))));
        organization.add(new Organization("Luxoft (Deutsche Bank)",
                "http://www.luxoft.ru/",
                new Experience("Ведущий программист",
                        "Участие в проекте Deutsche Bank CRM (WebLogic, Hibernate, Spring, Spring MVC, SmartGWT, GWT, Jasper, Oracle). Реализация клиентской и серверной части CRM. Реализация RIA-приложения для администрирования, мониторинга и анализа результатов в области алгоритмического трейдинга. JPA, Spring, Spring-MVC, GWT, ExtGWT (GXT), Highstock, Commet, HTML5.",
                        DateUtil.of(2010, 12),
                        DateUtil.of(2012, 4))));
        organization.add(new Organization("Yota",
                "https://www.yota.ru/",
                new Experience("Ведущий специалист",
                        "Дизайн и имплементация Java EE фреймворка для отдела \"Платежные Системы\" (GlassFish v2.1, v3, OC4J, EJB3, JAX-WS RI 2.1, Servlet 2.4, JSP, JMX, JMS, Maven2). Реализация администрирования, статистики и мониторинга фреймворка. Разработка online JMX клиента (Python/ Jython, Django, ExtJS)",
                        DateUtil.of(2008, 6),
                        DateUtil.of(2010, 12))));
        organization.add(new Organization("Enkata",
                "http://enkata.com/",
                new Experience("Разработчик ПО",
                        "Реализация клиентской (Eclipse RCP) и серверной (JBoss 4.2, Hibernate 3.0, Tomcat, JMS) частей кластерного J2EE приложения (OLAP, Data mining).",
                        DateUtil.of(2007, 3),
                        DateUtil.of(2008, 6))));
        organization.add(new Organization("Siemens AG",
                "https://www.siemens.com/ru/ru/home.html",
                new Experience("Разработчик ПО",
                        "Разработка информационной модели, проектирование интерфейсов, реализация и отладка ПО на мобильной IN платформе Siemens @vantage (Java, Unix).",
                        DateUtil.of(2005, 1),
                        DateUtil.of(2007, 2))));
        organization.add(new Organization("Alcatel",
                "http://www.alcatel.ru/",
                new Experience("Инженер по аппаратному и программному тестированию",
                        "Тестирование, отладка, внедрение ПО цифровой телефонной станции Alcatel 1000 S12 (CHILL, ASM).",
                        DateUtil.of(1997, 9),
                        DateUtil.of(2005, 1))));
        sections.put(SectionType.EXPERIENCE, new OrganizationSection(organization));

        List<Organization> education = new ArrayList<>();
        education.add(new Organization("Coursera",
                "https://www.coursera.org/course/progfun",
                new Experience("\"Functional Programming Principles in Scala\" by Martin Odersky",
                        null,
                        DateUtil.of(2013, 3),
                        DateUtil.of(2013, 5))));
        education.add(new Organization("Luxoft",
                "http://www.luxoft-training.ru/training/catalog/course.html?ID=22366",
                new Experience("Курс \"Объектно-ориентированный анализ ИС. Концептуальное моделирование на UML.\"",
                        null,
                        DateUtil.of(2011, 3),
                        DateUtil.of(2011, 4))));
        education.add(new Organization("Siemens AG",
                "http://www.siemens.ru/",
                new Experience("3 месяца обучения мобильным IN сетям (Берлин)",
                        null,
                        DateUtil.of(2005, 1),
                        DateUtil.of(2005, 4))));
        education.add(new Organization("Alcatel",
                "http://www.alcatel.ru/",
                new Experience("6 месяцев обучения цифровым телефонным сетям (Москва)", null,
                        DateUtil.of(1997, 9),
                        DateUtil.of(2005, 1))));
        education.add(new Organization("Санкт-Петербургский национальный исследовательский университет информационных технологий, механики и оптики",
                "http://www.ifmo.ru/",
                new Experience("Аспирантура (программист С, С++)",
                        null,
                        DateUtil.of(1993, 9),
                        DateUtil.of(1996, 7)),
                new Experience("Инженер (программист Fortran, C)",
                        null,
                        DateUtil.of(1987, 9),
                        DateUtil.of(1993, 7))));
        education.add(new Organization("Заочная физико-техническая школа при МФТИ",
                "http://www.school.mipt.ru/",
                new Experience("Закончил с отличием",
                        null,
                        DateUtil.of(1984, 9),
                        DateUtil.of(1987, 6))));
        sections.put(SectionType.EDUCATION, new OrganizationSection(education));

        Resume test = new Resume("Григорий Кислин");
        test.setContacts(contacts);
        test.setSections(sections);
        System.out.println(test);
    }
}