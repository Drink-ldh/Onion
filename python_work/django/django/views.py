from django.http import HttpResponse
from django.shortcuts import render
from HELLO_DJANGO.dao_emp import DaoEmp


def index(request):
    return HttpResponse("Hello Django")

def param1(request):
    a = request.GET['a']
    print("a",a)
    return HttpResponse("Hello[GET]" + a)

def param2(request):
    a = request.POST['a']
    print("a",a)
    return HttpResponse("Hello[POST]" + a)

def myforward(request):
    str = "1111"
    arr= [1,2,3,4]

    data = {
        'id' : '1',
        'name' : '홍길동',
        'str' : str,
        'arr' : arr
    }

    return render(request,"myforward.html",data)


def emp_list(request):
    de = DaoEmp()
    list = de.myselect()
    data = {
        'list' : list
    }

    
    return render(request,"emp_list.html", data)