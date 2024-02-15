from django.shortcuts import render
from django.http import HttpResponse


def HomePage(request):
    data={
        'title':"Student record",
        'lect': ["java",'php','python'],
    }
    return render(request,"index.html",data)

def printData(request):
    return HttpResponse(request,'index.html',{'name':'Arman'})
