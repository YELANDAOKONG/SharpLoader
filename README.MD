# SharpLoader

---

## 简介

### 什么是SharpLoader？

SharpLoader是一个独立于Fabric/Forge/NeoForge的新型Minecraft模组加载器，
用于加载来自C# (.NET)平台的模组。

> 由于技术限制，当前版本的SharpLoader无法直接加载C#托管DLL文件，
> 需要为C# DLL启用AOT编译(.NET 8+)，才能被JNI/JNA调用。
> 
> 在其他高性能的跨JVM/CLR调用方法出现之前，SharpLoader只能加载C# AOT编译的DLL文件。

> ## 此项目当前正暂停开发
> 作者正在寻找一种更好的跨JVM/CLR调用方法，以允许JVM调用C#托管DLL文件。

[文档中心](docs/INDEX.MD)

> **当前项目正在开发中。**

## 项目组成

> TODO...

## TODO

#### 本项目
- [ ] ...

#### 其他组成部分
- [ ] SharpLoader 本体
- [ ] SharpAPI
- [ ] ...

