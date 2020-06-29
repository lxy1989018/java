# git教程

<hr style=" height:5px;border:none;border-top:5px ridge red;"/>

# Git的安装与配置

# 1. 下载

　　官方网站：https://git-scm.com/downloads

　　　　根据自己的系统选择。

　　![img](git.assets/1463514-20190923091434367-1808263352.png)

　　会判断操作系统位数推荐下载版本，如果要手动选择的话可以在下方选择32位版本或64位版本。

 

# 2. 安装

　　(1) Next

　　![img](https://img2018.cnblogs.com/blog/1463514/201909/1463514-20190923092002851-1616353132.png)

　　(2) 默认就行，第一个是在桌面添加快捷方式，用处不大不用选。

　　![img](https://img2018.cnblogs.com/blog/1463514/201909/1463514-20190923092028615-1315899856.png)

　　(3) 选择一个Git的默认文本编辑器。

　　![img](git.assets/1463514-20190923092222982-1444389904.png)

　　(4) 选择Git可以用什么方式使用。

　　　　Use Git from Git Bash only：只能用Git提供的Git Bash才能使用Git，安全性最高。

　　　　Git from the command line and also from 3rd-party software：可以使用Git的命令行和第三方工具操作Git。因为一般会安装第三方的图形化操作软件(命令行不好记)，所以一般选这个。

　　　　Use Git and optional Unix tools from the Command Prompt：可以使用Git命令行和Unix工具。警告这会替换掉系统里查找和排列功能。

　　![img](https://img2018.cnblogs.com/blog/1463514/201909/1463514-20190923092426477-380658104.png)

　　(5) 选择Git使用的HTTPS通道。第一个是使用Open SSL库，第二个是使用Windows安全通道。

　　![img](git.assets/1463514-20190923093314242-1343518301.png)

　　(6) 选择Git命令行结尾的样式。

　　　　Checkout Windows-style, commit Unix-style line endings：检出Windows样式，提交Unix样式结尾。

　　　　Checkout as-is, commit Unix-style line endings：原样检出，提交Unix样式结尾。

　　　　Checkout as-is, commit as-is：原样检出，原样提交。

　　![img](git.assets/1463514-20190923095007843-1632450318.png)

　　(7) 选择一种Git Bash终端模拟器的样式。

　　　　Use MinTTY：使用自带的默认终端模拟器。

　　　　Use Windows' default console window：使用Windows默认命令行窗口。

　　![img](git.assets/1463514-20190923095731069-1969220974.png)

　　(8) 选择启用什么功能。

　　　　Enable file system caching：启用文件系统缓存。

　　　　Enable Git Credential Manager：启用Git凭据管理器。

　　　　Enable symbolic links：启用符号连接。

　　![img](git.assets/1463514-20190923100104317-1330358066.png)

　　(9) 前沿功能选择。是否启用还在测试中的功能。然后Install安装即可。

　　![img](git.assets/1463514-20190923100404214-2075342172.png)

10 配置环境变量:

path:git的安装目录的bin的文件夹

# 3. 检查是否安装成功

　　在系统命令提示符中输入：git --version，如果打印了Git的版本号，则安装成功。

　　![img](https://img2018.cnblogs.com/blog/1463514/201909/1463514-20190923100845984-1487849627.png)

 

# 4. 配置Git用户和邮箱

　　因为Git是分布式版本管理工具，所以每一个使用者需要提供个人信息，留下个人联系方式便于别的开发者联系。

```
　　# 设置用户姓名
　　git config --global user.name "姓名"
　　# 设置可以联系的邮箱地址
　　git config --global user.email "联系邮箱"　　
# 查看设置信息　　git config --global --list
```

 

# 5. 生成SSH密钥

　　SSH是Secure Shell安全外壳协议的缩写。它为网络服务提供目前较为可靠的安全协议，有效防止信息泄露问题。通过公钥和私钥的验证，建立安全连接。使用SSH方式和远程版本库通信的时候可以无需输入用户名密码进行验证。

　　在任意空白位置右击选择"Git Bash Here"，启动Git的终端模拟器。

　　输入： ssh-keygen -t rsa 后回车，会依次要求输入。

　　1) 密钥保存位置，默认是 /c/Users/用户名/.ssh/ 目录下。

　　2) 输入密码，默认无密码。

　　3) 确认输入密码，默认无密码。

　　之后在指定/默认的位置就有两个文件。

　　id_rsa 文件是私钥，一定保存好不能泄露；id_rsa.pub 文件是公钥，内容放在云端提供验证。

# 6.操作流程

![271314500648180](git.assets/271314500648180.png)



# 7.命令

![img](git.assets/3c6d55fbb2fb4316cd11b53de31c9c2508f7d3af.jpeg)



![img](git.assets/15742527-4c20ff44cf572d3c.png)

1、初始化一个Git仓库，使用git init命令。

2、添加文件到Git仓库，分两步：

使用命令git add <file>，注意，可反复多次使用，添加多个文件；

使用命令git commit -m <message>，完成。

3、要随时掌握工作区的状态，使用git status命令。

如果git status告诉你有文件被修改过，用git diff可以查看修改内容。

4、版本管理

HEAD指向的版本就是当前版本，因此，Git允许我们在版本的历史之间穿梭，使用命令git reset --hard commit_id。

穿梭前，用git log可以查看提交历史，以便确定要回退到哪个版本。

要重返未来，用git reflog查看命令历史，以便确定要回到未来的哪个版本

Git是如何跟踪修改的，每次修改，如果不用git add到暂存区，那就不会加入到commit中。

5、回退

场景1：当你改乱了工作区某个文件的内容，想直接丢弃工作区的修改时，用命令git checkout -- file。

场景2：当你不但改乱了工作区某个文件的内容，还添加到了暂存区时，想丢弃修改，分两步，第一步用命令git reset HEAD <file>，就回到了场景1，第二步按场景1操作。

6、删除

命令git rm用于删除一个文件。如果一个文件已经被提交到版本库，那么你永远不用担心误删，但是要小心，你只能恢复文件到最新版本，你会丢失**最近一次提交后你修改的内容**

**7、远程仓库
**

1）创建SSH Key。在用户主目录下，看看有没有.ssh目录，如果有，再看看这个目录下有没有id_rsa和id_rsa.pub这两个文件，如果已经有了，可直接跳到下一步。如果没有，打开Shell（Windows下打开Git Bash），创建SSH Key：

$ ssh-keygen -t rsa -C "youremail@example.com"

2）登陆GitHub，打开“Account settings”，“SSH Keys”页面：

然后，点“Add SSH Key”，填上任意Title，在Key文本框里粘贴id_rsa.pub文件的内容

3）你已经在本地创建了一个Git仓库后，又想在GitHub创建一个Git仓库，并且让这两个仓库进行远程同步，这样，GitHub上的仓库既可以作为备份，又可以让其他人通过该仓库来协作，真是一举多得。

首先，登陆GitHub，然后，在右上角找到“Create a new repo”按钮，创建一个新的仓库：

根据GitHub的提示，在本地的learngit仓库下运行命令：

$ git remote add origin git@github.com:michaelliao/learngit.git

关联后，使用命令git push -u origin master第一次推送master分支的所有内容；

此后，每次本地提交后，只要有必要，就可以使用命令git push origin master推送最新修改；

****这种方法不行的话，可以本地新建目录，从远程克隆git clone git@gitlab.*.com.cn:mk/test.git,修改本地代码如t1,修改git add t1、提交git commit -m altertest2，再拉git pull，最后推到远程仓库git push。









<div style="padding:10px;font-size:32px; color:red;border:double blue 6px;">
   <div style="font-size:24px;background:yellow;text-align:center;">java程序设计> 2020-06</div>