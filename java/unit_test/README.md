
# 单元测试

### 为什么写单元测试
- 1. 保证代码质量，减少bug。
- 2. 改善代码设计。
- 3. 节约时间，让开发更自信。

### 为什么单元测试可以节约时间
- 1. 如果没有单元测试，就只能把app运行起来测试，这比运行一次单元测试要慢很多。
- 2. 尽早发现bug，减少debug和fixbug的时间。
- 3. 重构的时候，大大减少手动验证重构正确性的时间。

### 单元测试步骤
- 1. setup：new出待测试的类，设置一些前提条件。
- 2. 执行运作：调用被测类的被测方法，并获取返回结果。
- 3. 验证结果：验证获取的结果跟预期的结果是一样的。

## IntelliJ IDEA单元测试

### 下载jar包
在[Download and Install · junit-team/junit4](https://github.com/junit-team/junit4/wiki/Download-and-Install)下载jar包：`[junit.jar](http://bit.ly/My9IXz)`和`[hamcrest-core.jar](http://bit.ly/1gbl25b)`，保存在`~/env/jar/groupId/artifactId/version/`下   

### 创建java工程
依次点击`File` --> `New` --> `project` --> `Java` --> `select project location` --> `Finish`创建Java工程`JUnit4Demo`  

### 引用jar包
打开`File` --> `Project Structure` --> `Modules` --> `Dependencies` --> `+(Add)` --> `Library` --> `Java`，选择jar包即可。`Export`不用勾选，`Scope`保持默认即可。  

### 创建待测试类
在`src`上右键，打开`New` --> `Java Class`，创建java类，在类名中输入`com.yulin.util.Math`，IDE会自动生成包，并把类放在包下。然后，在类中添加阶乘方法。
``` java
package com.yulin.util;

public class Math {

    public int factorial(int n) throws Exception {
        if (n < 0) {
            throw new Exception("负数没有阶乘");
        } else if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

}

```

### 创建测试类
在项目上右键，创建一个与`src`同级的目录`test`，用于放置测试代码。在`test`目录上右键，选择`Mark Directory As - Test Sources Root`，把`test`文件夹设置为测试文件的根目录。  
把光标放在`Math`类待测试方法`factorial`上，按下快捷键`command + shift + T`，弹出`Create Test`对话框，`Test library`选择`JUnit4`，`Class name`置为`MathTest`，`Generate`选中`setUp/@Before`和`tearDown/@After`，勾选待测试方法，点击`OK`。  
IDE会在`test`目录生成`com.yulin.util.MathTest`类。  
``` Java
package com.yulin.util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void factorial() {
    }
}
```

### 添加测试代码
在`factorial`方法中输入如下代码，测试预期值与实际值是否相等。
``` Java
    @Test
    public void factorial() {
        try {
            assertEquals(120, new Math().factorial(5));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```
在`MathTest`左边点击运行图标，选择`Run MathTest`，在IDE --> `Run`工具栏会显示运行结果。如果显示绿条，打印`Process finished with exit code 0`，并且没有没有多余提示，表明方法测试成功。如果实际运行结果与预期不同，会显示红条，并打印错误信息。  
测试类中3个方法的执行顺序为：`setUp` ==> `factorial` ==> `tearDown`  
