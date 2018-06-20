# -*- coding:utf-8 -*-

# 1. Python内置类型
# 2. 有序集合
# 3. 不能修改，只能查询，不能增删改

t = ('Adam', 'Lisa', 'Bart')
print(t)

# ()既可以表示tuple类型，也可以列表运算优先级，所以单元素的tuple需要加一个逗号，以免歧义
t = ('Adam', )
print(t)

# tuple定义后，就不能改变。没有append方法，也没有insert方法和pop方法。不能添加，不能删除，不能修改

# tuple和list一样，可以使用索引访问，也支持倒序索引，但不能赋值
print t[0]

# 0个元素
t = ()

# 创建包含1个元素的tuple时，需要额外加1个逗号
x = (1)
print x    # 1
y = (1,)
print y    # (1,)

# tuple的元素不可修改，但如果tuple的元素本身可以修改，如是一个list，那tuple的内容可以间接通过子内容修改
z = (1, True, ['a', 'b'])
print z    # (1, True, ['a', 'b'])
z[2][0] = 'x'
z[2][1] = 'y'
print z    # (1, True, ['x', 'y'])
