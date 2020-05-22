宣告時加上private，
無法從類別以外的地方設定或直接讀取

A.若冠上 public 公有的成員，可以被 其他程式自由的存取
B.若冠上 private 私有的成員，除了 package (資料夾)其他程式無法存取外，
    自身的程式(同檔案)也無法存取；運作的範圍只在該類別當中
C.若省略 公有與私有 ( public & private) 都不使用，那麼成員只會在同一 package 存取使用


在這個PrivateAndPublic.java中，定義了兩個類別，
一個是公開（public）的PrivateAndPublic類別，
所以檔案主檔名必須是PrivateAndPublic，

另一個是非公開的Circle，
一個原始碼中可以有多個類別定義，但只能有一個是公開類別，
且檔案主檔名必須與公開類別名稱相同。