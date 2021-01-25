.model small
.stack 100h                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
.data 
    str1 db 'a','b','c','d','$'
    tb db 'chuoi da doi: ',13,10,'$'    
    ;str1 db ?
    ;str2 db dup(4) 'a'
.code 
main proc
    mov ax,@data
    mov ds,ax
    mov es,ax  
    
    lea si, str1
    lea di, str1
    
    ;cld; std dinh huong lui
    mov cx,4
  lap: 
    lodsb; lay 1 ky tu tu chuoi -> ghi vao al
    sub al,20h
    stosb     ; store at DI    
    loop lap
    
    mov ah,9
    lea dx,tb
    int 21h
    lea dx,str1
    int 21h 
    
    
    ;int 21h
   
    mov ah,4ch
    int 21h
    main endp
end main
    
    