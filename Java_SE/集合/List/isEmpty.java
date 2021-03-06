1. isEmpty() 用于判断List内容是否为空，即list里一个元素也没有，
但是必须在 List<MallNews> getNewsList 本身不是空的引用的情况下才行。
即对象本身不能是空对象。
2.null一般判断该List的引用也空的情况下
例如：	List list1 =null;
List list2=new ArrayList();
System.out.println(list2.isEmpty()); //true

System.out.println(list1.isEmpty()); //空指针异常

因为list2对象已经分配了空间，所以可以使用list2.isEmpty()来判断使用有元素

如果用list2 !=null来判断，只能判断list2是否分配了空间

例如上面的list1使用list1.isEmpty())就会报空指针异常

list2.isEmpty()就为true

如果将上面的判断修改为

System.out.println(list2.isEmpty()); 

System.out.println(list1 == null); 

两者就都为true了


if(null == list || list.size() ==0 ){
}


list.isEmpty()和list.size()==0 没有区别

isEmpty()判断有没有元素
而size()返回有几个元素
如果判断一个集合有无元素 
建议用isEmpty()方法.这清晰,简明

list!=null跟!list.isEmpty()有什么区别?
这就相当与，你要喝水，
前面就是判断是不是连水杯都没有，
后面就是判断水杯里面没有水，
连盛水的东西都没有，
这个水从何而来？
所以一般的判断是
if(list!=null && !list.isEmpty()){
这个里面取list中的值
}else{
做其他处理
}
