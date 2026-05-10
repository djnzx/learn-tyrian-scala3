### 1. install sbt (if no)

```shell
brew install sbt
```

### 2. automatically compile all the changes

```shell
sbt
  tyrian
  ~fastOptJS
```

### 3. serve web server

```shell
cd tyrian
npm install
npm run start
```

### 4. open in the browser

```shell
open http://localhost:1234
```
