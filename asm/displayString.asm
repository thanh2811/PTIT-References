.model small
.stack 100h
.data
    tb db 'Enter a string; $'
    tb2 db 13,10,'String updated: $'
    str db 100 dup('$')
.code
    main proc
        mov ax,@data
        mov ds,ax   
        
        mov ah,9
        lea dx,tb
        int 21h
        
        lea si, str
        lea di,str
        xor cx,cx
        nhap:
            mov ah,1  
            int 21h
            cmp al,13
            je display
            mov [si],al
            inc si 
            inc cx
            jmp nhap
            
        display:
            mov ah,9
            lea dx, tb2
            int 21h
            lea dx,  str
            int 21h
            jmp ra
            
         toUppercase :
            
            
           l1:
                lodsb   ; get from DS:DI to store at AL
                mov ah,2
                int 21h
                cmp al,'Z'
                jg lonhon
                stosb
                loop l1
                
            lonhon:
                sub al,20h
                stosb
                loop l1
             Output:
                 mov ah,9
                 lea dx,str
                 int 21h
           ra: mov ah,4ch
            int 21h
            main endp
    
    end main
            