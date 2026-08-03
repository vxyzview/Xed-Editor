## xyzterm

**xyzterm** is a minimal, terminal-only Android app. It provides a proot-based Linux
environment (Ubuntu) with a full terminal emulator — no code editor, file manager, git UI,
or extensions system.

This project is a stripped-down fork of [Xed-Editor](https://github.com/Xed-Editor/Xed-Editor),
keeping only its terminal feature and the shared app infrastructure it depends on (settings,
theming, crash handling). All other Xed-Editor features were removed.

---

## Build the Project

Choose one of the following build methods.

<details>
<summary><strong>Option 1: Build Locally</strong></summary>

Build the **debug APK** (signed with the included test key):

```bash
./gradlew assembleDebug
```

The compiled APK will be located at `app/build/outputs/apk/debug/app-debug.apk`.

</details>

<details>
<summary><strong>Option 2: Build with Docker</strong></summary>

If you don't have the Android SDK or JDK 21 installed locally, you can build the project in a Docker
container:

```bash
DOCKER_BUILDKIT=1 docker build --target export-stage --output ./out .
```

The generated debug APK will be located at `out/debug/app-debug.apk`.

</details>

Note: the `soraX` editor-engine submodule is bundled directly in this copy of the project (rather
than linked as a live git submodule), since `:core:main` still compiles against it. If you turn
this project into your own git repository, you may want to re-add it as a proper submodule instead.

---

## License

Distributed under the GNU General Public License v3.0, inherited from the upstream Xed-Editor
project. See [`LICENSE`](/LICENSE) for details.
