## Introduction

esup-koha is a JSR168 portlet that displays loans information and holds information of the KOHA [http://koha-community.org] account of the portal current user.

The user can also renew its loans and cancel holds.

## Installation

You can package the war with this command :
```
mvn clean package
```

Next, you can deploy the portlet - with uPortal4 for example, you can deploy the portlet with a command like this one (from the uPortal directory) :
```
ant deployPortletApp -DportletApp=/opt/esup-koha/target/esup-koha.war
```

## Configurations

When publishing the portlet, you have to override/configure portlet preferences :
* kohaIlsdiUrl : the url of the ILS-DI web service of your koha instance ; it's like https://koha.esup-portail.org/cgi-bin/koha/ilsdi.pl
* kohaMainUrl : the url of the OPAC-MAIN web view of your koha instance ; it's like https://koha.esup-portail.org/cgi-bin/koha/opac-main.pl
* kohaDetailUrl : the url of the OPAC-DETAIL web view of your koha instance ; it's like https://koha.esup-portail.org/cgi-bin/koha/opac-detail.pl
* kohaUserUidAttr : the portal user attribute that contains the koha User ID ; this attribute must also be configured as an user-attribute in portlet.xml so that the esup-koha portlet can effectively get the value of this attribute for the current user (asking the portal).

## Screenshot

![Screenshot](https://github.com/EsupPortail/esup-koha/raw/master/src/etc/esup-koha.png)


