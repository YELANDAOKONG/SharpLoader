# SharpLoader

---

## 简介

### 什么是SharpLoader？

SharpLoader是一个独立于Fabric/Forge/NeoForge的新型Minecraft模组加载器，
用于加载来自C# (.NET)平台的模组。

> 由于技术限制，当前版本的SharpLoader无法直接加载C#托管DLL文件，
> 需要为C# DLL启用AOT编译(.NET 8+)，才能被JNI/JNA调用。
> 
> **在其他高性能的跨JVM/CLR调用方法出现之前，SharpLoader只能加载C# AOT编译的DLL文件。**
> 
> **优点：**
> - 更多平台支持
> 
> **缺点：**
> - 失去了C#的动态特性

> ### **！当前项目可能开发缓慢！**

[文档中心](docs/INDEX.MD)

> **当前项目正在开发中。**

## 项目组成

[SharpAPI C# (未实现)](https://github.com/YELANDAOKONG/SharpAPI)

> TODO...

## TODO

#### 本项目
- [ ] SharpClassTransformer
- [ ] InfoDependencies / InfoRequirements
- [ ] ...

#### 其他组成部分
- [ ] SharpLoader 本体
- [ ] SharpAPI
- [ ] ...

