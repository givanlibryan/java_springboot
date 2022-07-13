<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>TS Auth</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>bd4a073c-7bda-4b6c-a9d2-54640ed9c2a6</testSuiteGuid>
   <testCaseLink>
      <guid>a165e936-220b-474d-a145-59fef878ec0b</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Auth/Register</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>c27c1e13-86a4-437e-9dca-126dd7cc5b24</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/TD User</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>c27c1e13-86a4-437e-9dca-126dd7cc5b24</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Username</value>
         <variableId>9278b8e1-7707-451b-b18d-3b04a26f68dc</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>c27c1e13-86a4-437e-9dca-126dd7cc5b24</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>email</value>
         <variableId>573c5999-4d71-4143-a473-95456842f8e9</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>c27c1e13-86a4-437e-9dca-126dd7cc5b24</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>phone</value>
         <variableId>bac88a3a-06df-4b43-b39a-63689e664366</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>c27c1e13-86a4-437e-9dca-126dd7cc5b24</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>495e3997-f4f1-4614-a834-78c55621cbff</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>c27c1e13-86a4-437e-9dca-126dd7cc5b24</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>confirm_password</value>
         <variableId>1af2c540-8319-4707-9d36-187b993184de</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>c27c1e13-86a4-437e-9dca-126dd7cc5b24</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>address</value>
         <variableId>94ee86b7-6db7-40b5-ac0e-5079310879f2</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>644a703a-aa77-4458-80e0-121189b9b3f6</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Auth/Login</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>52be0f82-6a3b-4802-b8d6-49b27e185b49</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/TD User</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>52be0f82-6a3b-4802-b8d6-49b27e185b49</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Username</value>
         <variableId>7f909515-8fdd-4856-a6ff-391a93aba532</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>52be0f82-6a3b-4802-b8d6-49b27e185b49</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>d904a6d2-642b-4c4b-8141-af85630778eb</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>040ea9c2-4b8b-4b3e-9789-82aa4fecdba1</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Auth/Logout</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
</TestSuiteEntity>