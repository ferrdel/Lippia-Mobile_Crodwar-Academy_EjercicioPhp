## Lippia mobile apk sample project - Linux users

## System Requirements :  
+ Docker 18.09: https://docs.docker.com/install/linux/docker-ce/ubuntu/
+ Docker compose 1.24: https://docs.docker.com/compose/install/

# Getting started
 [Download]: <https://github.com/Crowdar/Lippia-mobile-sample-project/archive/master.zip>
- [Download] and unzip the source repository for this guide  
   or clone it using Git:  
    ``` $ git clone https://github.com/Crowdar/Lippia-mobile-sample-project.git ```
- Go to root directory  
    ``` $ cd Lippia-mobile-sample-project ```

#### Stack
This solution use docker containers to generate a context to execute the tests. 
Through docker compose we configure the following  
  
-	Selenium hub  
-   Emulated Android device

##### Starting stack
To start the containers, simply run the following command from terminal:

```
$ sudo docker-compose up -d hub
$ sudo docker-compose up -d samsung_s7_9.0
```

 > This command, will start download the images needed to build all the containers and start them. It takes a while to download the images depending on your internet connection.  
 > You must to set apkDirectory as parametter, in this case is hosted on ./sample_apk

```
Creating network "lippia-mobile-sample-project_default" with the default driver
Pulling selenium_hub (selenium/hub:3.14.0-curium)...
3.14.0-curium: Pulling from selenium/hub
3b37166ec614: Pull complete
ba077e1ddb3a: Pull complete
34c83d2bc656: Pull complete
84b69b6e4743: Pull complete
0f72e97e1f61: Pull complete
f1e40efee90d: Pull complete
d895db2c03b1: Pull complete
50924ff637d7: Pull complete
20cd0e693a2a: Pull complete
3456987eecb3: Pull complete
790bea0cc78e: Pull complete
91a1315cde56: Pull complete
1e4839706058: Pull complete
e7e241c3ff0c: Pull complete
8019cc927a8b: Pull complete
Digest: sha256:cdb630d95778495d5a3db3b2335dcf45688d97ae34c7cab73bf4dad718c50828
Status: Downloaded newer image for selenium/hub:3.14.0-curium
Pulling samsung_s7_9.0 (budtmo/docker-android-x86-9.0:)...
latest: Pulling from budtmo/docker-android-x86-9.0
35c102085707: Pull complete
251f5509d51d: Pull complete
8e829fe70a46: Pull complete
6001e1789921: Pull complete
6060e563dbb3: Pull complete
6060125ca445: Pull complete
f65a662cc4e5: Pull complete
5bbb04c03123: Pull complete
05e0ce6ba66a: Pull complete
bf466f792ddb: Pull complete
5df3d5ab0154: Pull complete
c8b79b37c666: Pull complete
09fe31ca7a65: Pull complete
2c9c239b16fe: Pull complete
af583fa3ce9d: Pull complete
e302515cee38: Pull complete
a76c87742cb6: Pull complete
5b5d8c65db86: Pull complete
b2979591fa55: Pull complete
d7cd233cfb91: Pull complete
ab46125c48b9: Pull complete
80caf90a8b15: Pull complete
13560fc7df15: Pull complete
2d4585e9c64e: Pull complete
686dce124be9: Pull complete
4c2e30948c8e: Pull complete
4e861e65af8f: Pull complete
4a261241feae: Pull complete
Digest: sha256:2f28bc6c2c6d98ea7c94b87abecdad0146e683d6b8f20e1f4c29167422da6016
Status: Downloaded newer image for budtmo/docker-android-x86-9.0:latest
Creating lippia-mobile-sample-project_selenium_hub_1 ... done
Creating lippia-mobile-sample-project_samsung_s7_9.0_1 ... done
Attaching to lippia-mobile-sample-project_selenium_hub_1, lippia-mobile-sample-project_s
amsung_s7_9.0_1
selenium_hub_1    | starting selenium hub with configuration:
selenium_hub_1    | {
selenium_hub_1    |   "host": "0.0.0.0",
selenium_hub_1    |   "port": 4444,
selenium_hub_1    |   "role": "hub",
selenium_hub_1    |   "maxSession": 5,
selenium_hub_1    |   "newSessionWaitTimeout": -1,
selenium_hub_1    |   "capabilityMatcher": "org.openqa.grid.internal.utils.DefaultCapabi
lityMatcher",
selenium_hub_1    |   "throwOnCapabilityNotPresent": true,
selenium_hub_1    |   "jettyMaxThreads": -1,
selenium_hub_1    |   "cleanUpCycle": 5000,
selenium_hub_1    |   "browserTimeout": 0,
selenium_hub_1    |   "timeout": 30,
selenium_hub_1    |   "debug": false
selenium_hub_1    | }
samsung_s7_9.0_1  | 2019-09-18 10:34:56,973 CRIT Supervisor running as root (no user in config file)
samsung_s7_9.0_1  | 2019-09-18 10:34:56,977 INFO supervisord started with pid 6
samsung_s7_9.0_1  | 2019-09-18 10:34:57,980 INFO spawned: 'xvfb' with pid 9
samsung_s7_9.0_1  | 2019-09-18 10:34:57,984 INFO spawned: 'port-forward' with pid 10
samsung_s7_9.0_1  | 2019-09-18 10:34:57,987 INFO spawned: 'novnc' with pid 11
samsung_s7_9.0_1  | 2019-09-18 10:34:57,989 INFO spawned: 'openbox' with pid 12
samsung_s7_9.0_1  | 2019-09-18 10:34:57,991 INFO spawned: 'x11vnc' with pid 13
samsung_s7_9.0_1  | 2019-09-18 10:34:57,994 INFO spawned: 'screen-copy' with pid 14
samsung_s7_9.0_1  | 2019-09-18 10:34:57,996 INFO spawned: 'docker-appium' with pid 15
samsung_s7_9.0_1  | 2019-09-18 10:34:57,998 INFO spawned: 'atd' with pid 16
samsung_s7_9.0_1  | 2019-09-18 10:34:58,004 INFO spawned: 'auto-recording' with pid 18
samsung_s7_9.0_1  | 2019-09-18 10:34:58,006 INFO spawned: 'adb-utils' with pid 19
samsung_s7_9.0_1  | 2019-09-18 10:34:58,691 INFO exited: atd (exit status 0; not expected)
samsung_s7_9.0_1  | 2019-09-18 10:34:58,692 INFO exited: screen-copy (exit status 0; notexpected)
samsung_s7_9.0_1  | 2019-09-18 10:34:59,124 INFO success: xvfb entered RUNNING state, process has stayed up for > than 1 seconds (startsecs)
samsung_s7_9.0_1  | 2019-09-18 10:34:59,124 INFO success: port-forward entered RUNNING state, process has stayed up for > than 1 seconds (startsecs)
samsung_s7_9.0_1  | 2019-09-18 10:34:59,124 INFO success: novnc entered RUNNING state, process has stayed up for > than 1 seconds (startsecs)
samsung_s7_9.0_1  | 2019-09-18 10:34:59,124 INFO success: openbox entered RUNNING state,process has stayed up for > than 1 seconds (startsecs)
samsung_s7_9.0_1  | 2019-09-18 10:34:59,124 INFO success: x11vnc entered RUNNING state,process has stayed up for > than 1 seconds (startsecs)
samsung_s7_9.0_1  | 2019-09-18 10:34:59,124 INFO success: docker-appium entered RUNNING state, process has stayed up for > than 1 seconds (startsecs)
samsung_s7_9.0_1  | 2019-09-18 10:34:59,124 INFO success: auto-recording entered RUNNING state, process has stayed up for > than 1 seconds (startsecs)
samsung_s7_9.0_1  | 2019-09-18 10:34:59,124 INFO success: adb-utils entered RUNNING state, process has stayed up for > than 1 seconds (startsecs)
samsung_s7_9.0_1  | 2019-09-18 10:34:59,637 INFO exited: x11vnc (exit status 1; not expected)
samsung_s7_9.0_1  | 2019-09-18 10:35:00,039 INFO spawned: 'x11vnc' with pid 60
samsung_s7_9.0_1  | 2019-09-18 10:35:00,044 INFO spawned: 'screen-copy' with pid 61
samsung_s7_9.0_1  | 2019-09-18 10:35:00,048 INFO spawned: 'atd' with pid 62
samsung_s7_9.0_1  | 2019-09-18 10:35:00,054 INFO exited: screen-copy (exit status 0; notexpected)
samsung_s7_9.0_1  | 2019-09-18 10:35:00,059 INFO exited: atd (exit status 0; not expected)
samsung_s7_9.0_1  | 2019-09-18 10:35:01,075 INFO success: x11vnc entered RUNNING state,process has stayed up for > than 1 seconds (startsecs)
samsung_s7_9.0_1  | 2019-09-18 10:35:02,121 INFO spawned: 'screen-copy' with pid 76
samsung_s7_9.0_1  | 2019-09-18 10:35:02,123 INFO spawned: 'atd' with pid 77
samsung_s7_9.0_1  | 2019-09-18 10:35:02,128 INFO exited: screen-copy (exit status 0; notexpected)
samsung_s7_9.0_1  | 2019-09-18 10:35:02,129 INFO exited: atd (exit status 0; not expected)
samsung_s7_9.0_1  | 2019-09-18 10:35:05,134 INFO spawned: 'screen-copy' with pid 84
samsung_s7_9.0_1  | 2019-09-18 10:35:05,137 INFO spawned: 'atd' with pid 85
samsung_s7_9.0_1  | 2019-09-18 10:35:05,144 INFO exited: screen-copy (exit status 0; notexpected)
samsung_s7_9.0_1  | 2019-09-18 10:35:05,144 INFO gave up: screen-copy entered FATAL state, too many start retries too quickly
samsung_s7_9.0_1  | 2019-09-18 10:35:05,146 INFO exited: atd (exit status 0; not expected)
samsung_s7_9.0_1  | 2019-09-18 10:35:06,147 INFO gave up: atd entered FATAL state, too many start retries too quickly
selenium_hub_1    | 17:35:08.353 INFO [GridLauncherV3.launch] - Selenium build info: version: '3.14.0', revision: 'aacccce0'
selenium_hub_1    | 17:35:08.394 INFO [GridLauncherV3$2.launch] - Launching Selenium Grid hub on port 4444
selenium_hub_1    | 2019-09-18 17:35:10.749:INFO::main: Logging initialized @14893ms toorg.seleniumhq.jetty9.util.log.StdErrLog
selenium_hub_1    | 17:35:12.419 INFO [Hub.start] - Selenium Grid hub is up and running
selenium_hub_1    | 17:35:12.420 INFO [Hub.start] - Nodes should register to http://172.18.0.2:4444/grid/register/
selenium_hub_1    | 17:35:12.421 INFO [Hub.start] - Clients should connect to http://172.18.0.2:4444/wd/hub
selenium_hub_1    | 17:35:23.472 INFO [DefaultGridRegistry.add] - Registered a node http://172.18.0.3:4723
samsung_s7_9.0_1  | 2019-09-18 10:36:45,687 INFO exited: adb-utils (exit status 0; expected)

```

After that you you can check the containers are up and running executing the following command
`$ sudo docker ps `. 

```
CONTAINER ID        IMAGE                           COMMAND                  CREATED             STATUS                  PORTS                                                       NAMES
34b268a8e7d6        budtmo/docker-android-x86-9.0   "/bin/sh -c '/usr/bi…"   21 hours ago        Up 21 hours (healthy)   4567/tcp, 4723/tcp, 5554-5555/tcp, 0.0.0.0:6080->6080/tcp   lippia-mobile-sample-project_samsung_s7_9.0_1
1346e5ba56db        selenium/hub:3.14.0-curium      "/opt/bin/entry_poin…"   21 hours ago        Up 21 hours             0.0.0.0:4444->4444/tcp                                      lippia-mobile-sample-project_selenium_hub_1
```


We have to wait a few second, waiting to start the emulator phone start, like that:

![dockerAndroidNovnc](img/mobile_emulator.png)


#### Now you be able to consume the solution and start running tests.
***

### Run from command line
To run tests you must be execute

```
$ sudo docker-compose up lippia

lippia-mobile-sample-project_hub_1 is up-to-date
Starting lippia-mobile-sample-project_lippia_1 ... done
Attaching to lippia-mobile-sample-project_lippia_1
lippia_1          | [INFO] Scanning for projects...
lippia_1          | [INFO] 
lippia_1          | [INFO] --------------< io.lippia:Lippia-mobile-example-project >---------------
lippia_1          | [INFO] Building Lippia-mobile-example-project 1.0.0
lippia_1          | [INFO] --------------------------------[ jar ]---------------------------------
lippia_1          | Downloading from central: https://repo.maven.apache.org/maven2/io/grpc/grpc-core/maven-metadata.xml
lippia_1          | Downloading from crowdarRepo: https://nexus-v3-repositories.automation.crowdaronline.com/repository/maven-public/io/grpc/grpc-core/maven-metadata.xml
Downloaded from central: https://repo.maven.apache.org/maven2/io/grpc/grpc-core/maven-metadata.xml (2.7 kB at 2.1 kB/s)
lippia_1          | Downloaded from crowdarRepo: https://nexus-v3-repositories.automation.crowdaronline.com/repository/maven-public/io/grpc/grpc-core/maven-metadata.xml (2.7 kB at 2.0 kB/s)
lippia_1          | Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-http2/maven-metadata.xml
lippia_1          | Downloading from crowdarRepo: https://nexus-v3-repositories.automation.crowdaronline.com/repository/maven-public/io/netty/netty-codec-http2/maven-metadata.xml
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-http2/maven-metadata.xml (2.7 kB at 7.9 kB/s)
lippia_1          | Downloaded from crowdarRepo: https://nexus-v3-repositories.automation.crowdaronline.com/repository/maven-public/io/netty/netty-codec-http2/maven-metadata.xml (2.8 kB at 6.3 kB/s)
lippia_1          | [INFO] 
lippia_1          | [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ Lippia-mobile-example-project ---
lippia_1          | [INFO] Deleting /opt/workspace/automation/target
lippia_1          | [INFO] 
lippia_1          | [INFO] --- maven-resources-plugin:2.4:resources (default-resources) @ Lippia-mobile-example-project ---
lippia_1          | [INFO] Using 'UTF-8' encoding to copy filtered resources.
lippia_1          | [INFO] Copying 8 resources
lippia_1          | [INFO] 
lippia_1          | [INFO] --- maven-compiler-plugin:3.7.0:compile (default-compile) @ Lippia-mobile-example-project ---
lippia_1          | [INFO] Changes detected - recompiling the module!
lippia_1          | [INFO] Compiling 12 source files to /opt/workspace/automation/target/classes
lippia_1          | [INFO] /opt/workspace/automation/src/main/java/com/crowdar/examples/steps/ApkApiDemoSteps.java: Some input files use or override a deprecated API.
lippia_1          | [INFO] /opt/workspace/automation/src/main/java/com/crowdar/examples/steps/ApkApiDemoSteps.java: Recompile with -Xlint:deprecation for details.
lippia_1          | [INFO] 
lippia_1          | [INFO] --- maven-resources-plugin:2.4:testResources (default-testResources) @ Lippia-mobile-example-project ---
lippia_1          | [INFO] Using 'UTF-8' encoding to copy filtered resources.
lippia_1          | [INFO] Copying 2 resources
lippia_1          | [INFO] 
lippia_1          | [INFO] --- maven-compiler-plugin:3.7.0:testCompile (default-testCompile) @ Lippia-mobile-example-project ---
lippia_1          | [INFO] Changes detected - recompiling the module!
lippia_1          | [INFO] Compiling 1 source file to /opt/workspace/automation/target/test-classes
lippia_1          | [INFO] 
lippia_1          | [INFO] --- maven-surefire-plugin:3.0.0-M4:test (default-test) @ Lippia-mobile-example-project ---
lippia_1          | [INFO] 
lippia_1          | [INFO] -------------------------------------------------------
lippia_1          | [INFO]  T E S T S
lippia_1          | [INFO] -------------------------------------------------------
lippia_1          | [INFO] Running TestSuite
lippia_1          | 07/09/20 11:50:18 INFO  BasicHook:20 - ------ Starting -----The user starts the application, registers a new user, changes the language, log out of the app and log in to the app.-----
lippia_1          | 07/09/20 11:50:18 INFO  BasicHook:20 - ------ Starting -----The user starts the application, registers a new user, changes the language, log out of the app and log in to the app.-----
lippia_1          | SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
lippia_1          | SLF4J: Defaulting to no-operation (NOP) logger implementation
lippia_1          | SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
lippia_1          | Sep 07, 2020 11:50:36 AM io.appium.java_client.remote.AppiumCommandExecutor$1 lambda$0
lippia_1          | INFO: Detected dialect: W3C
lippia_1          | 07/09/20 11:51:00 INFO  BasicHook:35 - ------ Ending -----The user starts the application, registers a new user, changes the language, log out of the app and log in to the app.-----
lippia_1          | 07/09/20 11:51:02 INFO  BasicHook:35 - ------ Ending -----The user starts the application, registers a new user, changes the language, log out of the app and log in to the app.-----
lippia_1          | Feature: As a potential client i want to interact with the mobile application
lippia_1          | 
lippia_1          |   Scenario Outline: The user starts the application, registers a new user, changes the language, log out of the app and log in to the app. # src/test/resources/features/Demo.feature:3
lippia_1          |     Given The app is loaded correctly
lippia_1          |     When The user goes to the Sign Up page
lippia_1          |     And The user registers a new user with: <username>, <email>, <password>
lippia_1          |     Then Home page is displayed
lippia_1          |     When The user changes the language
lippia_1          |     And The user log out of the app
lippia_1          |     Then Login page is displayed
lippia_1          |     When The user logs in the application with: <email>, <password>
lippia_1          |     Then Home page is displayed
lippia_1          | 
lippia_1          |     @Demo
lippia_1          |     Examples: 
lippia_1          | 
lippia_1          |   @Demo
lippia_1          |   Scenario Outline: The user starts the application, registers a new user, changes the language, log out of the app and log in to the app. # src/test/resources/features/Demo.feature:19
lippia_1          |     Given The app is loaded correctly                                                                                                      # LoginSteps.isLoginPageVisible()
lippia_1          |     When The user goes to the Sign Up page                                                                                                 # LoginSteps.goToSignUp()
lippia_1          |     And The user registers a new user with: automation, automation@gmail.com, 123456                                                       # SignUpSteps.doSignUpProcess(String,String,String)
lippia_1          |     Then Home page is displayed                                                                                                            # HomeSteps.isHomePageVisible()
lippia_1          |     When The user changes the language                                                                                                     # HomeSteps.doChangeLanguage()
lippia_1          |     And The user log out of the app                                                                                                        # HomeSteps.doSignOut()
lippia_1          |     Then Login page is displayed                                                                                                           # LoginSteps.isLoginPageVisible()
lippia_1          |     When The user logs in the application with: automation@gmail.com, 123456                                                               # LoginSteps.doLoginProcess(String,String)
lippia_1          |     Then Home page is displayed                                                                                                            # HomeSteps.isHomePageVisible()
lippia_1          | [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 44.659 s - in TestSuite
lippia_1          | [INFO] 
lippia_1          | [INFO] Results:
lippia_1          | [INFO] 
lippia_1          | [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
lippia_1          | [INFO] 
lippia_1          | [INFO] ------------------------------------------------------------------------
lippia_1          | [INFO] BUILD SUCCESS
lippia_1          | [INFO] ------------------------------------------------------------------------
lippia_1          | [INFO] Total time:  53.001 s
lippia_1          | [INFO] Finished at: 2020-09-07T11:51:03Z
lippia_1          | [INFO] ------------------------------------------------------------------------
lippia-mobile-sample-project_lippia_1 exited with code 0

```
## Check Docker stack is up and running
After starting the stack you can see  and selenium grid following url:

Selenium Grid: http://localhost:4444/grid/console

![gridConsole](img/grid_console.png)

Emulated Android device novnc: http://localhost:6080

![dockerAndroidNovnc](img/mobile_emulator.png)