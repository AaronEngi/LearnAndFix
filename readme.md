andfix实现原理
对比：tink基于dex包加载，替换dex包

andfix基于c++，替换方法

第一步，服务器生成修复包，class编译成dex，下载
第二步，app加载dex包
loadDex(File dexFilePath){
File optFile = new FIle(context.getCacheDir(), dexFilePaht.getName());
DexFile dexFile = DexFile.loadDex(dexFilePath, optFIle , Context.MODE_PRIVATE);
Enumeration<STring> entry = dexFIle.entries();
while(){
}
}

第三步，找到修复好的class、method A；找到缺陷method B


打包工具
dx.bat

dx --dex src out

生成out.dex
放到手机上

java内存
方法区
Test.class
main方法

堆区

栈区
方法调用，
