# 題目：製作 YouTube 影片下載器

此題目測試目標是針對 Java 網路應用程式撰寫與網路相關協定、週邊技術的統合測試。涵概範圍：

1. Java 基本語法、資料讀寫（檔案與串流資料操作）
1. 網路協定 HTTP、網頁標記語言 HTML、網頁腳本語言 Javascript
1. 標準函式庫與第三方函式庫使用運用

## 功能需求

YouTube 影片下載器供分為二個模組：
1. 影片網址解析模組 (VideoUrlParser)
1. 影片下載模組 (VideoDownloader)

## 成品的形式

請使用此專案進行開發：https://github.com/muzee-git/LabVideoDownloader，可在 github fork 此專案，或獨立上傳至自己的 github 帳戶。

除實作功能之外，需新增一個 BUILD.md 檔，描述如何編譯此專案，編譯後的完成品需輸出成 VideoDownloader.jar 包含所有相依函式庫

## 使用方法

使用者輸入下載指令，第 1 個參數是下載影片存檔的名稱，第 2 個參數是 YouTube 網址。

```
java -jar VideoDownloader.jar [filename] [youtube-url]
```

## 專案架構介紹

此為一個 eclipse project，除了 com.demo.Main 類別之外，它僅提供空白的實作。需完成下列類別的實作

```
com.demo.VideoDownloader
com.demo.VideoUrlParser
```

專案內有附上建議使用的 3rd Party Library：

```
commons-lang
commons-logging & log4j
jsoup
```

##工具

[Kej's FLV Retriever](http://kej.tw/flvretriever/) 為網友製作的 YouTube 網址解析服務。製作 YouTube 下載器的重點是利用此網站的功能製作出解析工具。不是要從無到有寫出解析的演算法，而是利用 HTTP 連線，向它取得解析結果加以應用，並利用它網站上現有的 javascript 函式取得 YouTube 下載位置。

## 參考資料

1. [jsoup](http://jsoup.org/cookbook/) 是一套解析 HTML 內容的 Library，在它的 cookbook 內有列出常用的方法。
1. [Java Scripting Programmer's Guide](http://docs.oracle.com/javase/6/docs/technotes/guides/scripting/programmer_guide/)

## 評分項目

1. 軟體的完成度
1. 程式碼的可讀性 
1. 實作速度 

完成度的給分：程式能用得分 1，程式不能用得分 0。
程式碼可讀性給分：0 至 100
實作速度：24 小時內完成 1.2，48 小時內完成 0.8，72 小時內完成 0.5。

總分算法是：完成度 \* (可讀性 \* 實作速度 + 加分題)

## 加分項目

1. 使 com.demo.VideoDownloader 支援斷線續傳 [+5]
1. 使用 Ant Script 編譯並製作 VideoDownloader.jar [+1]
1. 使用 Gradle 編譯並製作 VideoDownloader.jar [+5]
1. 版本控制有邏輯地、意圖明確地進行 commit [+5]
