## customized core for openai-kotlin

- enables an option to
  use [array as content](https://platform.openai.com/docs/api-reference/messages/createMessage#messages-createmessage-content)
  for [Assistant API](https://platform.openai.com/docs/assistants/overview)

## Usage

1. Add jitpack repository to your build.gradle
    ```kotlin
    repositories {
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
    ```

2. Exclude the original core dependency from the openai-kotlin dependency
    ```kotlin
   dependencies {
        implementation("com.aallam.openai:openai-client") {
            exclude(group = "com.aallam.openai", module = "openai-core")
        }
   }
    ```
   
3. Add dependency to your build.gradle  
   It's better to use the latest version.  
   [![Release](https://jitpack.io/v/cosmos-official/vingle-openai-core.svg)](https://jitpack.io/#cosmos-official/vingle-openai-core)
    ```kotlin
    dependencies {
        implementation("com.github.cosmos-official:vingle-openai-core:${version}")
    }
    ```
