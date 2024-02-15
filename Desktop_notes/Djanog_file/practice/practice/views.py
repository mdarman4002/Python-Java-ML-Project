from django.shortcuts import render
from django.http import HttpResponse


def record(request):
    data={
        'title':"Student record",
        'lect': ["java",'php','python'],
    }
    return render(request,"index.html",data)

def  aboutUs(request):
    return HttpResponse("<h>Great to meet with you<\h>")

def Homepage(request):
    return HttpResponse("<h> Home_page <\h>")

def courseId(request, courseId):
    return HttpResponse(courseId)

def basicCal(request):
    n3 = 0
    try:
        n1 = request.GET['num1']
        n2 = request.GET['num2']
        n3 = int(n1) + int(n2)
        print(n3)
    except:
        pass
    return render(request,"basicCal.html",{'output':n3})

def RegistrationForm(request):
    return render(request,'form6_project.html')

def UserPasswordform(request):
    return render(request,'UserPasswordform.html')