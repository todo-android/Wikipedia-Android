# WIkipedia-Android
![License](https://img.shields.io/aur/license/android-studio) ![API](https://img.shields.io/badge/API-14%2B-brightgreen) ![ktlint](https://img.shields.io/badge/code%20style-%E2%9D%A4-FF4081.svg)

This project is based on Andorid framework API wtih MVVM architecure.

# Main functions

- search page by word in wikipedia.

- search result is compsed as header and contents.
  
  - header is the result by search word.

  - contents are result related to search word.

- click header then load page in wikipedia.

- click contents then search page by the title.


# Consideration

- dark and light mode include webview.

- load bitmap from remote and `LruCache` it for viewholder.

- use `coroutines` for background thread.

- `AppModule` is for dependency injection.

- `AppFeature` is for lifecycle awareness for interactor of UI.

# Module

- `oohttp` is library for http. it's based on okhttp.

- `app` inclues oohttp library project as `jar` in `lib` folder.


# License

```xml
Designed and developed by 2021 libliboom (Ryan Lee)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```