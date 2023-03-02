<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>CompanyCreate</name>
   <tag></tag>
   <elementGuidId>82df7f82-723f-4127-8e28-8236de14b51c</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;Company\&quot;: {\n    \&quot;Id\&quot;: 0,\n    \&quot;CompanyName\&quot;: \&quot;${CompanyName}\&quot;,\n    \&quot;CompanyType\&quot;: ${CompanyType},\n    \&quot;Phone\&quot;: \&quot;${Phone}\&quot;,\n    \&quot;Email\&quot;: \&quot;${Email}\&quot;,\n    \&quot;Fax\&quot;: \&quot;${Fax}\&quot;,\n    \&quot;Website\&quot;: \&quot;${Website}\&quot;,\n    \&quot;Address\&quot;: \&quot;${Address}\&quot;,\n    \&quot;PostalCode\&quot;: \&quot;${PostalCode}\&quot;,\n    \&quot;City\&quot;: \&quot;\&quot;,\n    \&quot;CountryId\&quot;: ${CountryId}\n  }\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${Url}/Customers/rest/CRMServicesAPI/CompanyCreate</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>GlobalVariable.EnvBaseUrl</defaultValue>
      <description></description>
      <id>c8a4896a-5b05-429f-ac3e-d395cecc4eeb</id>
      <masked>false</masked>
      <name>Url</name>
   </variables>
   <variables>
      <defaultValue>'OutSystems'</defaultValue>
      <description></description>
      <id>729f2a23-b024-4a29-8492-24a47da4a155</id>
      <masked>false</masked>
      <name>CompanyName</name>
   </variables>
   <variables>
      <defaultValue>2</defaultValue>
      <description></description>
      <id>91fd86ff-1d9a-435f-bff2-29cfbbac232c</id>
      <masked>false</masked>
      <name>CompanyType</name>
   </variables>
   <variables>
      <defaultValue>'1234567'</defaultValue>
      <description></description>
      <id>127d35df-d8d4-4f04-8048-7ed76122f1ac</id>
      <masked>false</masked>
      <name>Phone</name>
   </variables>
   <variables>
      <defaultValue>'outsystems@outsystems.com'</defaultValue>
      <description></description>
      <id>8753f040-369f-4f3b-ade3-c40651d1d9ce</id>
      <masked>false</masked>
      <name>Email</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>e64e514e-9f0a-4cbe-b5d1-c83b9098d65d</id>
      <masked>false</masked>
      <name>Fax</name>
   </variables>
   <variables>
      <defaultValue>'www.outsystems.com'</defaultValue>
      <description></description>
      <id>03f77b2d-9899-4816-94ca-4d963329d181</id>
      <masked>false</masked>
      <name>Website</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>f674d8c8-ac49-4aa3-963d-83646a44d101</id>
      <masked>false</masked>
      <name>Address</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>6f4b5ac2-f0e5-4f37-9eaf-8e15d8cb1210</id>
      <masked>false</masked>
      <name>PostalCode</name>
   </variables>
   <variables>
      <defaultValue>67</defaultValue>
      <description></description>
      <id>4abd6f0d-8409-4be1-8f09-3499dd0f0a17</id>
      <masked>false</masked>
      <name>CountryId</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
