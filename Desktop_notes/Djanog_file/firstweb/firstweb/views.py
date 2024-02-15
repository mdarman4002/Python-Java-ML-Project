from django.http import HttpResponse
from django.shortcuts import render

def Homepage(request):
   data={
      'title':'Home new',
      'bdata':'nice to meet you',
      'clist':['Java', 'Html', 'css'],
      'student_details':[
          {'name':'Arman','phone':98756428},
          {'name': 'Ali', 'phone':'84189586'},

      ]

    }
   return render(request,'index.html',data)

def aboutUs(request):
    return HttpResponse("My first web page")

def course(request,courseId):
    return HttpResponse(courseId)



