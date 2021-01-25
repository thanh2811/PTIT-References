.model small
.stack 100h
.data 
    tbnhap db 'Enter a string: ','$'
    rev db 13,10,'String reverse: $'  
    str db ?
.code 
    main proc
        mov ax,@data
        mov ds,ax
        
        ;nhap string
        lea dx,tbnhap
        mov ah,9
        int 21h
        
        
        xor cx,cx
        
        ; start
        
        p1: mov ah,1
            int 21h
            cmp al,13
            je p2
            push ax
            inc cx 
            jmp p1
            
        p2: lea dx,rev
            mov ah,9
            int 21h
            
        p3: pop dx
            mov ah,2
            ;mov dl,al
            int 21h
            loop p3
            
        exit: mov ah,4ch
              int 21h
        main endp
    end main