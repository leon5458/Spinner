# Spinner
###
android:spinnerMode：列表显示的模式，有两个选择，为弹出列表（dialog）以及下拉列表（dropdown），如果不特别设置，为下拉列表。。
android:entries：使用<string-array.../>资源配置数据源。
android:prompt：对当前下拉列表设置标题，仅在dialog模式下有效。传递一个“@string/name”资源，需要在需要在资源文件中定义<string.../>。
　　作为一个列表选择控件，Spinner具有一些选中选项可以触发的事件，但它本身没有定义这些事件，均继承自间接父类AdapterView。Spinner支持的几个常用事件有以下几个 ：
AdapterView.OnItemCLickListener：列表项被点击时触发。
AdapterView.OnItemLongClickListener：列表项被长按时触发。
AdapterView.OnItemSelectedListener：列表项被选择时触发。  
