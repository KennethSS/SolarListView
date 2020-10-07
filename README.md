<h1 align="center">SimpleRecyclerView</h1></br>

<p align="center">
A SimpleRecyclerView with databinding for andorid list
</p>

<p align="center">
  <a href="https://opensource.org/licenses/Apache-2.0"><img alt="License" src="https://img.shields.io/badge/License-Apache%202.0-blue.svg"/></a>
</p>

### Gradle 
Add below codes to your **root** `build.gradle` file (not your module build.gradle file).
```
allprojects {
    repositories {
        jcenter()
    }
}
```
And add a dependency code to your **module**'s `build.gradle` file.
```gradle
dependencies {
  implementation 'com.github.KennethSS:SimpleRecyclerView:1.0.3'
}
```

## Usage
### Basic Example
```kotlin
main_basic_recycler_view.adapter = DataBindingAdapter<Food>(
            FoodViewModel()
       ).apply {
            submitList(foods)
       }
```
