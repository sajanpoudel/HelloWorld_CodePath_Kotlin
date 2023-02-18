# Screen

The app has one screen, `MainActivity`.

| View | Id | Behaviour |
| --- | --- | --- |
| Dog image | `imageView` | Decorative, has a content description |
| Introduction | `introView` | Text from `sajan_intro` |
| SAY HELLO! | `button` | Logs the click and shows `toast_hello` |
| Greet Me! | `buttongreet` | Shows `toast_greet` |

All visible text is defined in `res/values/strings.xml`, so translating the app only needs a new `values-xx/strings.xml`.
